package ru.java_lessons.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ATM {
    public static void main(String[] args) {
        System.out.println(getMoney(10000));
    }

    private static List<Integer> getMoney(int amount){
        int[] nominals = {5000,2000,1000,500,200,100,50};
        if (amount <= 0|| amount < nominals[nominals.length - 1]) throw new IllegalArgumentException("Amount is <= 0");
        Stack<Integer> result = new Stack<>();
        for (int banknote : nominals) { // iterable :
            while (amount - banknote >= 0){
                amount -= banknote;
                result.push(banknote);
            }
        }
        return result;
    }
}
