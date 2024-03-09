package ru.java_lessons.lesson16;

import java.util.concurrent.TimeUnit;

public class MainThreadEx1 {
    private volatile static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (flag){
                System.out.println(Thread.currentThread().getName() + " flag == true");
            }
        });

        thread1.start();
        TimeUnit.SECONDS.sleep(5); //deadlock

        Thread thread2 = new Thread(() -> {
            flag = false;
            System.out.println(Thread.currentThread().getName() + " flag == false");
        });

        thread2.start();

        thread1.join();
        thread2.join();
    }
}
