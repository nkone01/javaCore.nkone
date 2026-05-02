package javacore.chapter06.workshop;
import lombok.Getter;
import lombok.Setter;
public class LombokIntegration {
    @Getter @Setter
    private String nom;

    @Getter @Setter
    private int age;

    // Implémentation manuelle du Getter pour "nom"
    public String getNomManuellement() {
        System.out.println("Mon Getter custom est appelé !");
        return this.nom;
    }

    public static void main(String[] args) {
        LombokIntegration personne = new LombokIntegration();
        personne.setNom("Dupont");
        personne.setAge(30);

        System.out.println("Nom : " + personne.getNom()); // Utilise le Getter de Lombok
        System.out.println("Nom (manuel) : " + personne.getNomManuellement()); // Utilise le Getter manuel
        System.out.println("Age : " + personne.getAge()); // Utilise le Getter de Lombok
    }


}


