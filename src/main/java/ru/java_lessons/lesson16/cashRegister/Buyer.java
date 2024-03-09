package ru.java_lessons.lesson16.cashRegister;

import java.util.Queue;

public class Buyer extends Thread{
    private final Queue<CashBox> freeCashBoxes;

    public Buyer(Queue<CashBox> cashBoxes){
        this.freeCashBoxes = cashBoxes;
    }

    @Override
    public void run(){
        try {
            synchronized (freeCashBoxes) {
                while (true) {
                    if (!freeCashBoxes.isEmpty()) {
                        CashBox cashBox = freeCashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " cashbox is occupied :" + cashBox);

                        freeCashBoxes.wait(5);

                        System.out.println(Thread.currentThread().getName() + " free cashbox :" + cashBox);
                        freeCashBoxes.add(cashBox);
                        freeCashBoxes.notifyAll();
                        break;
                    } else {
                        freeCashBoxes.wait(5);
                        System.out.println(Thread.currentThread().getName() + " waiting for free cashbox");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
