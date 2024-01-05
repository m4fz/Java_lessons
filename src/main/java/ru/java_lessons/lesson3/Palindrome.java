package ru.java_lessons.lesson3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(null));
        System.out.println(palindrome(""));
        System.out.println(palindrome(" "));
        System.out.println(palindrome("  "));
        System.out.println(palindrome("ada"));
        System.out.println("\n");
        System.out.println(palindromeSimplified(null));
        System.out.println(palindromeSimplified(""));
        System.out.println(palindromeSimplified(" "));
        System.out.println(palindromeSimplified("  "));
        System.out.println(palindromeSimplified("ada"));

    }

    /**
     * Проверка заданного слова на палиндром
     * @param str Заданный текст для проверки на палиндром
     * @return Возврат булевого значения, палиндром - true, не палиндром - false
     */
    static boolean palindrome(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("Invalid string");
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start != end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Более компактная форма проверки слова на палиндром
     * @param str
     * @return
     */
    static boolean palindromeSimplified(String str){
        return str != null && !str.isEmpty() && !str.isBlank() && str.equals(new StringBuilder(str).reverse().toString());
        //return str == null || str.isEmpty() || str.isBlank() ? false : str.equals(new StringBuilder(str).reverse().toString());
        // if - ?
        // else - :
    }
    /*
    int a = 100;
    int b = 200;
    int c = 300;

    System.out.println(a > b ? "a" : b > c ? "b" : "c"); // "if" is almost always better
    */
}
