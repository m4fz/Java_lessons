package ru.java_lessons.lesson4.OOP2;

import java.sql.SQLOutput;

public class Cat extends Animal{
    String name;

    Cat(){

    }

    Cat(String name){
        this.name = name;
    }
    //overdriven method with more than one type of variable
    Cat(int age, String breed, String name){
        super(age, breed); // sending values to AnimalClass constructor and accessing its constructor from current method
        this.name = name;
    }

    @Override //Re-defined (method @override used only when inherited/extended)
    void eat(){
        super.eat();
        System.out.println("Cat " + name + " is eating");
    }

    @Override
    void voice() {
        System.out.println("Cat " + name + " - meow.");
    }
}
