package javacore.chapter06.workshop;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EmployeeRecursivitySearch {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("employees-data.json"));

        Map<String, Set<String>> skillsByType = new HashMap<>();
        Map<String, Set<String>> skillsByCountry = new HashMap<>();

        parseJson(root, "", skillsByType, skillsByCountry);

        System.out.println("Compétences par type :");
        skillsByType.forEach((type, skills) -> System.out.println(type + ": " + skills));

        System.out.println("\nCompétences par pays :");
        skillsByCountry.forEach((country, skills) -> System.out.println(country + ": " + skills));

        exportToFile(skillsByType, skillsByCountry);
    }

    private static void parseJson(JsonNode node, String country, Map<String, Set<String>> skillsByType, Map<String, Set<String>> skillsByCountry) {
        if (node.isObject()) {
            if (node.has("pays")) {
                country = node.get("pays").asText();
            }
            if (node.has("type") && node.has("competences")) {
                String type = node.get("type").asText();
                Set<String> skills = new HashSet<>();
                node.get("competences").elements().forEachRemaining(skill -> skills.add(skill.asText()));
                skillsByType.computeIfAbsent(type, k -> new HashSet<>()).addAll(skills);
                skillsByCountry.computeIfAbsent(country, k -> new HashSet<>()).addAll(skills);
            }
            node.fields().forEachRemaining(entry -> parseJson(entry.getValue(), country, skillsByType, skillsByCountry));
        } else if (node.isArray()) {
            node.elements().forEachRemaining(element -> parseJson(element, country, skillsByType, skillsByCountry));
        }
    }

    private static void exportToFile(Map<String, Set<String>> skillsByType, Map<String, Set<String>> skillsByCountry) {
        try (FileWriter writer = new FileWriter("resultats.txt")) {
            writer.write("Compétences par type :\n");
            skillsByType.forEach((type, skills) -> {
                try {
                    writer.write(type + ": " + skills + "\n");
                } catch (IOException e) {
                    System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
                }
            });
            writer.write("\nCompétences par pays :\n");
            skillsByCountry.forEach((country, skills) -> {
                try {
                    writer.write(country + ": " + skills + "\n");
                } catch (IOException e) {
                    System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
                }
            });
            System.out.println("Résultats exportés dans resultats.txt");
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier : " + e.getMessage());
        }
    }
}