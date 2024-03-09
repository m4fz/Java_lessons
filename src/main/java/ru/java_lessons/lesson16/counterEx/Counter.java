package ru.java_lessons.lesson16.counterEx;

public class Counter {
    private int count;

    private static int countStatic;
    private final Object lock = new Object();


    public void increment() {
        synchronized(lock) {
            this.count++;
        }
    }
    public static void incrementStatic() {
        synchronized(Counter.class) {
            countStatic++;
        }
    }

    public static int getCountStatic() {
        return countStatic;
    }

    public static void setCountStatic(int countStatic) {
        Counter.countStatic = countStatic;
    }

    public void decrement() {
        this.count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
