package ru.java_lessons.lesson16.counterEx;

import java.util.ArrayList;
import java.util.List;

public class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 20000; i++) {
            Thread thread = new Thread(Counter::incrementStatic); //new Thread(counter::increment);
            thread.start();
            threads.add(thread);
            System.out.println(thread.getName());
        }

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }

        });
        //System.out.println(counter.getCount());
        System.out.println(Counter.getCountStatic());
    }
}
