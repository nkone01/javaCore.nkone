package javacore.chapter06.workshop;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

 class Database {
    private String path;
    private Properties config;
    private static final int CHUNK_SIZE = 1000;
    private static final String ALGORITHM = "AES/GCM/NoPadding";
    private static final int TAG_LENGTH = 128;
    private static final ObjectMapper mapper = new ObjectMapper();
    private final ReentrantLock lock = new ReentrantLock();

    public Database(Properties config) {
        this.config = config;
        this.path = config.getProperty("db.path");
    }

    // Étape 3 : Gestion des fichiers .jcsql
    public void createTable(String tableName) {
        try {
            File file = new File(path + "/" + tableName + ".jcsql");
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Impossible de créer le fichier");
            }
        } catch (IOException e) {
            throw new DatabaseException("Erreur lors de la création du fichier", e);
        }
    }

    public void deleteTable(String tableName) {
        try {
            File file = new File(path + "/" + tableName + ".jcsql");
            if (file.exists() && !file.delete()) {
                throw new IOException("Impossible de supprimer le fichier");
            }
        } catch (IOException e) {
            throw new DatabaseException("Erreur lors de la suppression du fichier", e);
        }
    }

    // Étape 4 : Ajout de données
    public void insert(String tableName, Object obj) {
        lock.lock();
        try {
            int chunk = getChunk(tableName);
            File file = new File(path + "/" + tableName + "_" + chunk + ".jcsql");
            try (FileWriter writer = new FileWriter(file, true)) {
                String data = encrypt(mapper.writeValueAsString(obj));
                writer.append(data).append("\n");
            }
        } catch (Exception e) {
            throw new DatabaseException("Erreur lors de l'ajout de données", e);
        } finally {
            lock.unlock();
        }
    }

    // Étape 5 : Lecture de données
    public List<Object> select(String tableName) {
        List<Object> objects = new ArrayList<>();
        int chunk = getChunk(tableName);
        for (int i = 0; i <= chunk; i++) {
            File file = new File(path + "/" + tableName + "_" + i + ".jcsql");
            if (file.exists()) {
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        objects.add(mapper.readValue(decrypt(line), Object.class));
                    }
                } catch (Exception e) {
                    throw new DatabaseException("Erreur lors de la lecture des données", e);
                }
            }
        }
        return objects;
    }

    // Étape 6 : Structure du code
    private int getChunk(String tableName) {
        File dir = new File(path);
        int chunk = 0;
        if (dir.exists()) {
            for (File file : dir.listFiles()) {
                if (file.getName().startsWith(tableName + "_")) {
                    String[] parts = file.getName().split("_");
                    int currentChunk = Integer.parseInt(parts[1].split("\\.")[0]);
                    if (currentChunk > chunk) {
                        chunk = currentChunk;
                    }
                }
            }
        }
        return chunk;
    }

    // Étape 12 : Chiffrement
    private String encrypt(String data) {
        try {
            SecretKeySpec key = new SecretKeySpec(config.getProperty("db.key").getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            byte[] iv = new byte[12];
            new Random().nextBytes(iv);
            GCMParameterSpec spec = new GCMParameterSpec(TAG_LENGTH, iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, spec);
            byte[] encrypted = cipher.doFinal(data.getBytes());
            byte[] result = new byte[iv.length + encrypted.length];
            System.arraycopy(iv, 0, result, 0, iv.length);
            System.arraycopy(encrypted, 0, result, iv.length, encrypted.length);
            return Arrays.toString(result);
        } catch (Exception e) {
            throw new DatabaseException("Erreur lors du chiffrement", e);
        }
    }

    private String decrypt(String data) {
        try {
            SecretKeySpec key = new SecretKeySpec(config.getProperty("db.key").getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            String[] parts = data.substring(1, data.length() - 1).split(", ");
            byte[] bytes = new byte[parts.length];
            for (int i = 0; i < parts.length; i++) {
                bytes[i] = Byte.parseByte(parts[i]);
            }
            byte[] iv = Arrays.copyOfRange(bytes, 0, 12);
            byte[] encrypted = Arrays.copyOfRange(bytes, 12, bytes.length);
            GCMParameterSpec spec = new GCMParameterSpec(TAG_LENGTH, iv);
            cipher.init(Cipher.DECRYPT_MODE, key, spec);
            return new String(cipher.doFinal(encrypted));
        } catch (Exception e) {
            throw new DatabaseException("Erreur lors du déchiffrement", e);
        }
    }
}

class DatabaseException extends RuntimeException {
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
 class Main {
    public static void main(String[] args) {
        Properties config = new Properties();
        config.setProperty("db.path", "path/to/db");
        config.setProperty("db.key", "mysecretkey123456");

        Database database = new Database(config);

        // Créer une table
        database.createTable("utilisateurs");

        // Insérer des données
        Utilisateur utilisateur1 = new Utilisateur("John", "Doe", "john.doe@example.com");
        Utilisateur utilisateur2 = new Utilisateur("Jane", "Doe", "jane.doe@example.com");
        database.insert("utilisateurs", utilisateur1);
        database.insert("utilisateurs", utilisateur2);

        // Sélectionner des données
        List<Object> utilisateurs = database.select("utilisateurs");
        for (Object utilisateur : utilisateurs) {
            System.out.println(utilisateur);
        }

        // Supprimer une table
        database.deleteTable("utilisateurs");
    }
}

class Utilisateur {
    private String nom;
    private String prenom;
    private String email;

    public Utilisateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


