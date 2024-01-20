package ru.java_lessons.lesson7;

public class ExceptionExample1 {
    static <T> void checkAge (T age){
        if (!(age instanceof Integer)){
            throw new IllegalArgumentException("age must be integer");
        } else {
            if ((Integer) age < 18) {
                throw new ToYoungException("Is underage");
            } else {
                System.out.println("Access allowed");
            }
        }
    }
}
