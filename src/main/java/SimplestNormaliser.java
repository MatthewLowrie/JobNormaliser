package com.example;

import java.util.List;

public class SimplestNormaliser {

    private final List<String> titles = List.of(
            "architect",
            "software engineer",
            "quantity surveyor",
            "accountant"
    );

    public String normalise(String input) {
        if (input == null || input.isBlank()) return null;

        String lower = input.toLowerCase().trim();

        double bestScore = 0;
        String bestMatch = null;

        for (String title : titles) {
            double score = score(lower, title.toLowerCase());
            if (score > bestScore) {
                bestScore = score;
                bestMatch = title;
            }
        }

        return bestMatch;
    }

    private double score(String input, String title) {
        int matches = 0;
        for (String word : title.split(" ")) {
            if (input.contains(word)) matches++;
        }
        return (double) matches / title.split(" ").length;
    }
}
