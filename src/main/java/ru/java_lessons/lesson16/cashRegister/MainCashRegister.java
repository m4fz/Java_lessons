package ru.java_lessons.lesson16.cashRegister;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class MainCashRegister {
    public static void main(String[] args) {
        Queue<CashBox> cashBoxes = new ArrayDeque<>(List.of(new CashBox(),new CashBox(), new CashBox()));
        List<Thread> threads = Stream.of(
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes),
                new Buyer(cashBoxes))
                .map(Thread::new)
                .peek(Thread::start)
                .toList();

        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
