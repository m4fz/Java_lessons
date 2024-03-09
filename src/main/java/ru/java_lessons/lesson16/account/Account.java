package ru.java_lessons.lesson16.account;

public class Account {
    private static int generator = 1;

    private final int id;
    private int money;

    public Account(int money){
        this.money = money;
        this.id = generator++;
    }
    public void addMoney(int money){
        this.money += money;
    }

    public boolean takeMoney(int money){
        if (this.money >= money){
            this.money -= money;
            return true;
        } else return false;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
