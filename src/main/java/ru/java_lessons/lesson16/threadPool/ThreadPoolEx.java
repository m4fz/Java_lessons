package ru.java_lessons.lesson16.threadPool;

import java.util.concurrent.*;

public class ThreadPoolEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        threadPool.submit(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }

        });
        threadPool.shutdown();
        threadPool.awaitTermination(5, TimeUnit.MILLISECONDS);
    }
}
