package ru.java_lessons.lesson16.threadPool;

import java.math.BigInteger;
import java.util.concurrent.*;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newWorkStealingPool(8);
        Callable<BigInteger> callable = ThreadPoolEx2::fibonacciSequence;
        Future<BigInteger> result = threadPool.submit(callable);
        System.out.println(result.get());
        threadPool.awaitTermination(5, TimeUnit.MILLISECONDS);
        threadPool.shutdown();
    }
    private static BigInteger fibonacciSequence() {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i < 1000000; i++) {
            res = a.add(b);
            a = b;
            b = res;
        }
        return res;
    }
}
