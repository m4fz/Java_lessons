package ru.java_lessons.lesson9;

public class OutOfChargeException extends RuntimeException{
    public OutOfChargeException(String message){
        super(message);
    }
}
