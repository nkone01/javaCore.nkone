package javacore.chapter05.object.exercice;

public class ObjectPen {

    public static void main() {

        Pen pen = new Pen();
        pen.nom = "Stylo";
        pen.couleur = "Bleu";
        pen.prix = 2.50;
        pen.quantite = 10;
        pen.fabricant = "Bic";
        pen.poids = "15g";

        pen.displayInformations();

    }


}
