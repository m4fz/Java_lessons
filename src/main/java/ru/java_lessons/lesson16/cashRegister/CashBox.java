package ru.java_lessons.lesson16.cashRegister;

public class CashBox {
    private static int generator = 0;
    private final int id;

    public CashBox(){
        this.id = ++generator;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
