package ru.java_lessons.lesson7;

public class ToYoungException extends RuntimeException{ // must be extended by runtimeException

     public ToYoungException(String message){ // not checked exception
         super(message);
     }
}
