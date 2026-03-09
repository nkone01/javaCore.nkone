package javacore.chapter05.object.exercice;

public class LibraryBook {

         String isbn;
         String titre;
         String auteur;
         int anneePublication;
         boolean estEmprunte;

        public void afficherResume() {
            System.out.println("Titre : " + titre);
            System.out.println("Auteur : " + auteur);
            System.out.println("Année de publication : " + anneePublication);
            System.out.println("ISBN : " + isbn);
            System.out.println("État : " + (estEmprunte ? "Emprunté" : "Disponible"));
        }



}