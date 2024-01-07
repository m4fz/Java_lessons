package ru.java_lessons.lesson4.OOP4;

public class Animal_Imp implements Animal{ // while classes are extended to, interfaces can only be implemented

    //example of necessary overriding of an interface method
    @Override
    public void makeVoice() {
        System.out.println("Гав");
    }

    @Override
    public int getLength(String str) {
        return str.length();
    }
}
