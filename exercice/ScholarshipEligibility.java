package javacore.chapter02.condition.exercice;

public class ScholarshipEligibility {

    public static void main(String[] args) {
        // Test values: 3.5, 4.0, 2.0
        double studentGpa = 4.0;

        // Test values: 30000, 50000, 70000
        int householdIncome = 50000;

        // Test values: true, false
        boolean hasExtracurricular = true;

        if (studentGpa > 3.5 && householdIncome < 40000 && hasExtracurricular) {
            System.out.println("Éligible à une bourse pleine");
        } else if (studentGpa > 3.5 && householdIncome >= 40000 && householdIncome < 60000 && hasExtracurricular) {
            System.out.println("Éligible à une bourse partielle");
        } else {
            System.out.println("Non éligible à la bourse");
        }
    }

}
