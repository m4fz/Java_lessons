package ru.java_lessons.lesson18;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 5, 10, 10};
        ATM atm = new ATM(arr);
        System.out.println(atm.getMoney(12650L));
        System.out.println("starting amount " + atm.getStartFullAmount());
        System.out.println("current amount " + atm.getCurrentfullAmount());
    }
}
