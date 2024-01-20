package ru.java_lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        GenericClass<String, Integer, Boolean> generics = new GenericClass<>("Mike", 35,true); //no primitive variables only links, generics use parameterization
        System.out.println(generics);

        GenericClass1.println(generics);
        System.out.println(ExceptionExample.calculate(1,0));



        try {
            ExceptionExample1.checkAge("asdas");
        } catch (IllegalArgumentException e){
            System.out.println(" Sad :( ");
        }
        try {
            ExceptionExample2.getPets("Mouse");
        } catch (PetCheckException e) {
            System.out.println(e.getMessage());
        }

        try {
            ExceptionExample3.getNumber(11);
        } catch (NumberTooLarge | NumberTooSmall e){
            System.out.println(e.getMessage());
        }

        System.out.println("Still working");
    }
}
