package javacore.chapter05.object.exercice;

public class ObjectBook {

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();
        book.isbn = "978-2070612905";
        book.titre = "Le Seigneur des anneaux";
        book.auteur = "J.R.R. Tolkien";
        book.anneePublication = 1954;
        book.estEmprunte = false;

        book.afficherResume();
    }

}
