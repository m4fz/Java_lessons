package ru.java_lessons.lesson4.OOP4;

public class HDD implements Memory{ // implements memory interface and overrides its values
    @Override
    public void read() {
        System.out.println("hdd read");
    }

    @Override
    public void write() {
        System.out.println("hdd write");
    }
}
