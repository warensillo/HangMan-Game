package com.example.hangman.Controllers;

import com.example.hangman.utils.WordGenerator;

public class GameController {
    private String category;
    private String difficulty;

    public void setupGame(String category, String difficulty) {
        this.category = category;
        this.difficulty = difficulty;

        // Generate the word based on category and difficulty
        String word = WordGenerator.generateWord(category, difficulty);

        // Initialize game logic and UI
        initializeGame(word);
    }

    private void initializeGame(String word) {
        // Logic to display word blanks, etc.
    }
}
