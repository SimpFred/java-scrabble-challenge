package com.booleanuk;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    String word;
    Map<Character, Integer> scoreMap = createScoreMap();

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public int score() {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                score += scoreMap.get(c);
            }
        }
        return score;
    }

    private Map<Character, Integer> createScoreMap() {
        Map<Character, Integer> map = new HashMap<>();

        addScores(map, 1, "AEIOULNRST");
        addScores(map, 2, "DG");
        addScores(map, 3, "BCMP");
        addScores(map, 4, "FHVWY");
        addScores(map, 5, "K");
        addScores(map, 8, "JX");
        addScores(map, 10, "QZ");

        return map;
    }

    private void addScores(Map<Character, Integer> map, int score, String letters) {
        for (char letter : letters.toCharArray()) {
            map.put(letter, score);
        }
    }
}
