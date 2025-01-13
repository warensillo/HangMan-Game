package com.example.hangman.utils;


import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WordGenerator {
    private static final Map<String, List<String>> WORDS = Map.of(
            "Countries", List.of("India", "France", "Brazil", "Japan"),
            "Food", List.of("Pizza", "Burger", "Sushi", "Pasta"),
            "Animals", List.of("Cat", "Elephant", "Giraffe", "Tiger"),
            "Random", List.of("Java", "Computer", "Hangman", "Gaming")
    );

    public static String generateWord(String category, String difficulty) {
        List<String> words = WORDS.getOrDefault(category, Collections.emptyList());

        return words.stream()
                .filter(word -> {
                    int length = word.length();
                    if ("Easy".equals(difficulty)) return length <= 5;
                    if ("Medium".equals(difficulty)) return length > 5 && length <= 8;
                    return length > 8; // Difficult
                })
                .findAny()
                .orElse("Default");
    }
}
