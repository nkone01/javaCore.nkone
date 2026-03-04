package javacore.chapter05.object.exercice;

public class Pen {

     String nom;
     String couleur;
     String fabricant;
     String poids;
     double prix;
     int quantite;


     public void displayInformations() {
         System.out.println("Nom: " + nom);
         System.out.println("Couleur: " + couleur);
         System.out.println("Prix: " + prix + "€");
         System.out.println("Quantité: " + quantite);
         System.out.println("Fabricant: " + fabricant);
         System.out.println("Poids: " + poids);

     }
}
