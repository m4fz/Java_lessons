package ru.java_lessons.lesson16;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        System.out.println(myThread.isDaemon());
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());

        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println(Thread.currentThread().getName());
        thread.start();
        thread.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
