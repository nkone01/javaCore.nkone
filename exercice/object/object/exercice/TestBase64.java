package javacore.chapter05.object.exercice;

import java.util.Base64;

public class TestBase64 {

        public static void main(String[] args) {

            //Identification de l'erreur de compilation: "import sun.misc.BASE64Encoder"
            // qui est une classe déja dépréciée en java pour l'encodage en Base64

            //String texte = "Bonjour le monde!";

            // Encodage
            //String encoded = Base64.getEncoder().encode(texte.getBytes()).toString();
            //System.out.println("Encodé : " + encoded);

            // Décodage
           // byte[] decodedBytes = Base64.getDecoder().decode(encoded.getBytes());
            //String decoded = decodedBytes.toString();
            //System.out.println("Décodé : " + decoded);

            //Correction de l'erreur de compilation : importation de la classe java.util.Base64 à la place,
            // recommandée en java pour l'encodage en Base64

            String originalString = "Hello, World!";
            String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
            System.out.println("Encoded string: " + encodedString);
        }

}
