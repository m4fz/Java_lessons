package ru.java_lessons.lesson12;

public class Lambda2Main {
    public static void main(String[] args) {
        MathOperation plus = (a, b) -> a + b;
        MathOperation minus = (a, b) -> a - b;
        MathOperation dev = (a, b) -> a / b;
        MathOperation multi = (a, b) -> a * b;

        System.out.println(getResult(3,4,plus));
        System.out.println(getResult(8,5,minus));
        System.out.println(getResult(3,4,dev));
        System.out.println(getResult(34,18,multi));
    }

    private static double getResult(double a, double b, MathOperation operation){
        return operation.doOperation(a,b);
    }
}
