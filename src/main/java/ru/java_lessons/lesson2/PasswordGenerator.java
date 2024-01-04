package ru.java_lessons.lesson2;

import java.util.Random;

public class PasswordGenerator {
    final static int ASCII_START_NUMBERS = 48;
    final static int ASCII_END_NUMBERS = 57;
    final static int ASCII_BIG_LETTER_START = 65;
    final static int ASCII_BIG_LETTER_END = 90;
    final static int ASCII_SMALL_LETTER_START = 97;
    final static int ASCII_SMALL_LETTER_END = 122;

    public static void main(String[] args) {
        System.out.println(generatePassword(8, false, true));
    }

    /**
     *
     * @param passwordLength
     * @param onlyDigits
     * @param onlyLetters
     * @return
     */
    static String generatePassword(int passwordLength, boolean onlyDigits, boolean onlyLetters) {
        // Numbers from 48 to 57
        // Letters 65 to 90 , 97 to 122
        String password = "";
        if (onlyDigits){
            password = generateOnlyStringPassword(passwordLength);
        } else if (onlyLetters) {
            password = generateOnlyNumbersPassword(passwordLength);
        } else {
            password = generatePassword(passwordLength);
        }
        return password;
    }

    static String generateOnlyNumbersPassword(int passwordLength) {
        String password = "";
        Random random = new Random();
        int i = 0;
        while (i < passwordLength) {
            i++;
            password += (char) random.nextInt(ASCII_START_NUMBERS, ASCII_END_NUMBERS + 1);
        }
        return password;
    }

    static String generateOnlyStringPassword(int passwordLength) {
        int k = 0;
        String password = "";
        Random random = new Random();
        while (k < passwordLength) {
            k++;
            if (random.nextBoolean()) {
                password += (char) random.nextInt(ASCII_BIG_LETTER_START, ASCII_BIG_LETTER_END + 1);
            } else {
                password += (char) random.nextInt(ASCII_SMALL_LETTER_START, ASCII_SMALL_LETTER_END + 1);
            }
        }
        return password;
    }

    static String generatePassword(int passwordLength){
        int j = 0;
        String password = "";
        Random random = new Random();
        while (j < passwordLength){
            j++;
            int choice = random.nextInt(0,3);
            if (choice == 0){
                password += (char) random.nextInt(ASCII_BIG_LETTER_START, ASCII_BIG_LETTER_END + 1);
            } else if (choice == 1) {
                password += (char) random.nextInt(ASCII_SMALL_LETTER_START, ASCII_SMALL_LETTER_END + 1);
            } else {
                password += (char) random.nextInt(ASCII_START_NUMBERS, ASCII_END_NUMBERS + 1);
            }
        }
        return password;
    }
}
