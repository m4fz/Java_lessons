package ru.java_lessons.lesson7;

import ru.java_lessons.lesson4.OOP2.Dog;

public class ExceptionExample2 {
    private static final String DOG = "dog";
    private static final String CAT = "cat";


    static void getPets(String animal) throws PetCheckException{
        if(animal.equalsIgnoreCase(DOG) || animal.equalsIgnoreCase(CAT)){
            System.out.println("Welcome!");
        } else {
            throw new PetCheckException("Only cats and dogs accepted");
        }
    }
}
