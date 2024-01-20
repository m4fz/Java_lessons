package ru.java_lessons.lesson7;

public class ExceptionExample {

    public static int calculate(int a, int b){
        try {
            return  a/b;
        } catch (ArithmeticException e){
            System.out.println("Dividing by zero");
        } catch(IllegalArgumentException e){
            System.out.println("No variable was given");
        } finally {
            System.out.println("End");
        }
        return -1;
    }
}
