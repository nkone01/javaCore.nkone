package javacore.chapter05.object.exercice;

public class SpecialCaracters {

    public static void main(String[] args) {
        String welcomeText = "Bonjour, je m'appelle Alexandre, mais tu peux m'appeler \"Alex\" !";
        System.out.println(welcomeText);

        String attention = "/!\\ Attention aux erreurs /!\\";
        System.out.println(attention);

        String texte = "Bonjour\tMonde";
        System.out.println(texte);

        String texte2 = "Bonjour\nMonde";
        System.out.println(texte2);

        System.out.print("Bonjour\n");
        System.out.print("Monde\n");
    }

}
