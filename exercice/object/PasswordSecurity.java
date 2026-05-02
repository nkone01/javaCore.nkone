package javacore.chapter06.workshop;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.mindrot.jbcrypt.BCrypt;

    public class PasswordSecurity {

        public static void main(String[] args) throws Exception {
            String password = "monMotDePasse";

            // Encodage Base64
            String encodedPassword = encodeBase64(password);
            System.out.println("Encoded password: " + encodedPassword);
            String decodedPassword = decodeBase64(encodedPassword);
            System.out.println("Decoded password: " + decodedPassword);

            // Chiffrement AES
            SecretKey secretKey = generateAESKey();
            String encryptedPassword = encryptAES(password, secretKey);
            System.out.println("Encrypted password: " + encryptedPassword);
            String decryptedPassword = decryptAES(encryptedPassword, secretKey);
            System.out.println("Decrypted password: " + decryptedPassword);

            // Hachage SHA-1
            String hashedPassword = hashSHA1(password);
            System.out.println("Hashed password: " + hashedPassword);
            System.out.println("Is password correct? " + isPasswordCorrect(password, hashedPassword));

            // BCrypt
            String bcryptHash = bcryptHash(password);
            System.out.println("BCrypt hash: " + bcryptHash);
            System.out.println("Is password correct? " + bcryptCheck(password, bcryptHash));
        }

        // Encodage Base64
        public static String encodeBase64(String password) {
            return Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
        }

        public static String decodeBase64(String encodedPassword) {
            return new String(Base64.getDecoder().decode(encodedPassword), StandardCharsets.UTF_8);
        }

        // Chiffrement AES
        public static SecretKey generateAESKey() throws Exception {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            return keyGen.generateKey();
        }

        public static String encryptAES(String password, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }

        public static String decryptAES(String encryptedPassword, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPassword));
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        }

        // Hachage SHA-1
        public static String hashSHA1(String password) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashedBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashedBytes);
        }

        public static boolean isPasswordCorrect(String password, String hashedPassword) throws NoSuchAlgorithmException {
            return hashSHA1(password).equals(hashedPassword);
        }

        // BCrypt
        public static String bcryptHash(String password) {
            return BCrypt.hashpw(password, BCrypt.gensalt());
        }

        public static boolean bcryptCheck(String password, String bcryptHash) {
            return BCrypt.checkpw(password, bcryptHash);
        }

        // Utilitaire
        public static String bytesToHex(byte[] bytes) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }

    }

