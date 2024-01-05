package ru.java_lessons.lesson3;

import java.sql.Statement;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//        System.out.println(anagram(" ",""));
//        System.out.println(anagram(" ",null));
        System.out.println(anagram("hello","hi"));
        System.out.println(anagram("hello","loleh"));

    }

    /**
     * Проверка переменной на свойства анаграммы
     * @param str1 Первое заданное значение
     * @param str2 Второе заданное значение
     * @return Возврат булевого значения, анаграмма - true, не анаграмма - false
     */
    static boolean anagram(String str1, String str2){
        if(!validWord(str1) && !validWord(str2)) return false;
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

    /**
     * Проверка переменной на пустое значение
     * @param str Заданное значение
     * @return Возврат булевого значения, слово - true, пустое место или не заполненная переменная - false
     */
    static boolean validWord(String str){
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("Invalid string: " + str);
            return false;
        }
        return true;
    }
}
