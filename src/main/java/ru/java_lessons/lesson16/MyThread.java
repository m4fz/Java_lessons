package ru.java_lessons.lesson16;

public class MyThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("my thread");

        System.out.println(Thread.currentThread().getName());
    }
}
