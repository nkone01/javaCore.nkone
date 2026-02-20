package javacore.chapter04.function.exercice;

public class FrenchNetSalaryCalculator {

    public static void main(String[] args) {
        double[] hourlyGrossSalaries = {11.07, 17.50, 22.50, 35.00};
        double socialChargePercentage = 0.22;
        double taxAllowancePercentage = 0.10;

        for (double hourlyGrossSalary : hourlyGrossSalaries) {
            System.out.println("Salaire horaire brut : " + hourlyGrossSalary + "€/heure");
            double annualGrossSalary = calculateAnnualGrossSalary(hourlyGrossSalary);
            System.out.println("Salaire brut annuel : " + annualGrossSalary + "€");
            double annualNetSalaryBeforeTax = applySocialCharges(annualGrossSalary, socialChargePercentage);
            System.out.println("Salaire net annuel avant impôt : " + annualNetSalaryBeforeTax + "€");
            double annualNetSalaryBeforeAllowance = applyTaxAllowance(annualNetSalaryBeforeTax, taxAllowancePercentage);
            System.out.println("Salaire net annuel avant abattement : " + annualNetSalaryBeforeAllowance + "€");
            double annualNetSalary = applyRevenueTax(annualNetSalaryBeforeAllowance);
            System.out.println("Salaire net annuel : " + annualNetSalary + "€");
            System.out.println();
        }
    }

    public static double calculateAnnualGrossSalary(double hourlyGrossSalary) {
        int hoursPerWeek = 35;
        int weeksPerYear = 52;
        return hourlyGrossSalary * hoursPerWeek * weeksPerYear;
    }

    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage) {
        return annualGrossSalary * (1 - socialChargePercentage);
    }

    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage) {
        return annualNetSalary * (1 - taxAllowancePercentage);
    }

    public static double applyRevenueTax(double annualNetSalary) {
        double[] taxBrackets = {10225, 26070, 74545, 160336};
        double[] taxRates = {0.11, 0.30, 0.41, 0.45};
        double tax = 0;
        double remainingSalary = annualNetSalary;

        for (int i = 0; i < taxBrackets.length; i++) {
            if (remainingSalary > taxBrackets[i]) {
                tax += taxBrackets[i] * taxRates[i];
                remainingSalary -= taxBrackets[i];
            } else {
                tax += remainingSalary * taxRates[i];
                break;
            }
        }

        return annualNetSalary - tax;
    }
}
