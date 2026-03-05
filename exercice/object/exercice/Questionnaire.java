package javacore.chapter05.object.exercice;

public class Questionnaire {
    private String prenom;
    private int age;
    private double resultat;
    private String couleur;
    private String animal;

    public Questionnaire(String prenom, int age, double resultat, String couleur, String animal) {
        this.prenom = prenom;
        this.age = age;
        this.resultat = resultat;
        this.couleur = couleur;
        this.animal = animal;
    }

    public void afficherReponses() {
        System.out.println("Merci pour vos réponses !");
        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Résultat de 5 / 2 : " + resultat);
        System.out.println("Couleur préférée : " + couleur);
        System.out.println("Animal préféré : " + animal);
    }
}