package ru.java_lessons.lesson4.OOP2;

import java.security.PublicKey;

public class Animal {
    private final String DEF_BREED = "breed";
    private int age;
    private String breed;
    private final int DEF_AGE = 0;
    public static int paws = 4; // static values can be accessed only in classes(which can be extended to by other classes) and not objects

    Animal(){ //default java constructor

    }

    Animal(int age){ //custom constructor that sets the age
        this.age = age;
    }

    Animal(String breed){ //custom constructor that sets the breed
        this.breed = breed;
    }
    Animal(int age, String breed){ // overloaded constructor that can set both variables values at once
        this.age = age;
        this.breed = breed;
    }
    // constructors can be accessed by making a new instance of something(e.g Animal snake = new Animal("enter constructor values here"))

    //getters are used to get the value of some variable (can be used in other classes of same package)
    public int getAge(){
        return this.age;
    }
    public String getBreed(){
        return this.breed;
    }
    //setters are used to set a new value to something

    public void setAge(int age){
        if (age > 100 || age < 0){
            this.age = DEF_AGE;
        }
        else this.age = age;
    }

    public void setBreed(String breed){
        if (breed == null || breed.isBlank() || breed.isEmpty()){
            this.breed = DEF_BREED;
        }
        else this.breed = breed;
    }
    // both getters and setters are basic methods

    void eat(){
        System.out.println("Animal is eating");
    }
    void voice(){
        System.out.println("Animal made a sound");
    }
    public static boolean isAnimal(Animal animal){
        return animal != null && animal instanceof Animal;
    }
}
