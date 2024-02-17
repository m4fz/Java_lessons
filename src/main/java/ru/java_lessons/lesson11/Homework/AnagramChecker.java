package ru.java_lessons.lesson11.Homework;

import java.util.Scanner;
import java.util.TreeMap;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1 = scanner.next().toLowerCase();

        System.out.println("Enter the second word: ");
        String word2 = scanner.next().toLowerCase();

        if (areAnagrams(word1, word2)) {
            System.out.println("The words '" + word1 + "' and '" + word2 + "' are anagrams.");
        } else {
            System.out.println("The words '" + word1 + "' and '" + word2 + "' are not anagrams.");
        }
    }
    public static boolean areAnagrams(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        TreeMap<Character, Integer> word1Map = new TreeMap<>();
        TreeMap<Character, Integer> word2Map = new TreeMap<>();

        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }
        return word1Map.equals(word2Map);
    }


}
