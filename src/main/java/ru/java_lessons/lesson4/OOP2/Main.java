package ru.java_lessons.lesson4.OOP2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(8,"breed","name");
        Dog dog = new Dog("Hank");
//        cat.age = 2;
//        cat.breed = "maine coon";
        cat.eat();
        cat.voice();
        Cat.paws = 5;
//        dog.age = 5;
//        dog.breed = "bulldog";
        dog.eat();


        Animal cat1 = new Cat("j"); //Name variable established in Cat.java(class) cannot be accessed from Animal.java(class), only from Cat.java
        Animal dog1 = new Dog("k");

//        cat1.age = 3;
//        cat1.breed = "metis";
        cat1.eat();
        cat1.voice();
//        dog1.age = 6;
//        dog1.breed = "pudel";

        Animal animal = new Animal(43,"squirrel");
        System.out.println(Animal.isAnimal(cat));
    }
}
