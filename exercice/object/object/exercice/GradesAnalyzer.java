package javacore.chapter05.object.exercice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradesAnalyzer {

    public static void main(String[] args) {

        List<Integer> notes = new ArrayList<>();
        Scanner scanner = new Scanner( System.in );
        while (true) {
            System.out.println("Entrez une note (ou 'done' pour terminer) : ");
            String input = scanner.next();
            if (input.equals("done")) {
                break;
            }

            int note = Integer.parseInt(input);
            if (note < 0 || note > 20) {
                    System.out.println("Note invalide. Veuillez réessayer : ");
            } else {
                notes.add(note);
                if (notes.size() >= 30) {
                        break;

                }
            }

        }

        if (notes.size() < 2) {
            System.out.println("Vous devez entrer au moins 2 notes.");
            return;
        }

        System.out.println("Moyenne Générale = " + getAverage(notes));
        System.out.println("Note Minimale = " + getMinGrade(notes));
        System.out.println("Note Maximale = " + getMaxGrade(notes));
        int threshold = 10;
        System.out.println("Nombre de notes > " + threshold + " = " + getGradeCountAboveThreshold(notes, threshold) + " (soit " + (getGradeCountAboveThreshold(notes, threshold) * 100.0 / notes.size()) + "%)");
        System.out.println("Nombre de notes [0 - 5] = " + getGradeCountBetweenRange(notes, 0, 5) + " (soit " + (getGradeCountBetweenRange(notes, 0, 5) * 100.0 / notes.size()) + "%)");
        System.out.println("Nombre de notes [6 - 10] = " + getGradeCountBetweenRange(notes, 6, 10) + " (soit " + (getGradeCountBetweenRange(notes, 6, 10) * 100.0 / notes.size()) + "%)");
        System.out.println("Nombre de notes [11 - 15] = " + getGradeCountBetweenRange(notes, 11, 15) + " (soit " + (getGradeCountBetweenRange(notes, 11, 15) * 100.0 / notes.size()) + "%)");
        System.out.println("Nombre de notes [16 - 20] = " + getGradeCountBetweenRange(notes, 16, 20) + " (soit " + (getGradeCountBetweenRange(notes, 16, 20) * 100.0 / notes.size()) + "%)");
    }

    public static double getAverage(List<Integer> gradesList) {
        int somme = 0;
        for (int note : gradesList) {
            somme += note;
        }
        return (double) somme / gradesList.size();
    }

    public static int getMinGrade(List<Integer> gradesList) {
        int min = Integer.MAX_VALUE;
        for (int note : gradesList) {
            if (note < min) {
                min = note;
            }
        }
        return min;
    }

    public static int getMaxGrade(List<Integer> gradesList) {
        int max = Integer.MIN_VALUE;
        for (int note : gradesList) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

    public static int getGradeCountAboveThreshold(List<Integer> gradesList, int threshold) {
        int count = 0;
        for (int note : gradesList) {
            if (note > threshold) {
                count++;
            }
        }
        return count;
    }

    public static int getGradeCountBetweenRange(List<Integer> gradesList, int from, int to) {
        int count = 0;
        for (int note : gradesList) {
            if (note >= from && note <= to) {
                count++;
            }
        }
        return count;
    }
}

