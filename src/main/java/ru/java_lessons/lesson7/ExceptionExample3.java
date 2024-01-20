package ru.java_lessons.lesson7;

public class ExceptionExample3 {
    public static void getNumber(int c) throws NumberTooLarge, NumberTooSmall {
        if (c > 10){
            throw new NumberTooLarge("This number is too large, number should be between 1 and 10");
        } else if (c < 1){
            throw new NumberTooSmall("This number is too small, number should be between 1 and 10");
        }
    }
}
