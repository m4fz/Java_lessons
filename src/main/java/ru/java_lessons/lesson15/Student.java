package ru.java_lessons.lesson15;

public class Student{
    private int age;
    String name;
    public double weight;
    static int number;
    protected int mark;

    public Student(int age, String name, double weight, int mark) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.mark = mark;
    }

    public Student() {
    }

    private Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public static int getNumber() {
        return number;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
