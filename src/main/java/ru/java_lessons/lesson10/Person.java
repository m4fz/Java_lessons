package ru.java_lessons.lesson10;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;
    private final double weight;
    private final LocalDateTime dateOfBirth;

    public Person(String name, int age, double weight, LocalDateTime dateOfBirth) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(weight, person.weight) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public int compareTo(Person o) {

//        if (this.age > o.age) return 1;
//        else if (this.age < o.age) return -1;
//        else return 0;


        return Integer.compare(this.age, o.age);
    }
}
