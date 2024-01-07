package ru.java_lessons.lesson4.OOP3;

public class TestPrivateConstructor{
    // cannot inherit final class
    private int a;
    private TestPrivateConstructor(){
        //cannot be inherited but can be used to make new variables
    }

    public TestPrivateConstructor(int a){
        this.a = a;
    }
}
