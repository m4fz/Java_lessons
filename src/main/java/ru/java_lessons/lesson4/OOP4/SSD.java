package ru.java_lessons.lesson4.OOP4;

public class SSD implements Memory{ // also implements memory interface and overrides its values

    @Override
    public void read() {
        System.out.println("ssd read");
    }

    @Override
    public void write() {
        System.out.println("ssd read");
    }
}
