package javacore.chapter02.condition.exercice;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // netAnnualSalary = 10000, 20000, 40000, 100000, 250000, 450000
        double netAnnualSalary = 450000;

        double abattement = netAnnualSalary * 0.1;
        if (abattement > 10000) {
            abattement = 10000;
        }
        double revenuImposable = netAnnualSalary - abattement;

        double impot = 0;
        if (revenuImposable > 177106) {
            impot += (revenuImposable - 177106) * 0.45;
            revenuImposable = 177106;
        }
        if (revenuImposable > 82341) {
            impot += (revenuImposable - 82341) * 0.41;
            revenuImposable = 82341;
        }
        if (revenuImposable > 28797) {
            impot += (revenuImposable - 28797) * 0.3;
            revenuImposable = 28797;
        }
        if (revenuImposable > 11294) {
            impot += (revenuImposable - 11294) * 0.11;
        }

        double pourcentageImpot = (impot / netAnnualSalary) * 100;

        System.out.println("Impôt sur le revenu : " + impot);
        System.out.println("Pourcentage d'impôt : " + pourcentageImpot + "%");

    }
}
