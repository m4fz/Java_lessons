package ru.java_lessons.lesson18;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATM {
    private Long currentfullAmount;
    private final Long startFullAmount;
    private final int[] nominals = {5000, 2000,1000,500,200,100,50,10};
    private final int[] countOfNominals; //= {1, 2, 3, 5, 5, 5, 10, 10};

    public ATM(int[] countOfNominals){
        this.countOfNominals = countOfNominals;
        this.currentfullAmount = calculateFullAmount();
        this.startFullAmount = calculateFullAmount();

    }
    private Long calculateFullAmount(){
        int i = 0;
        Long sum = 0L;
        while (i < nominals.length){
            sum += (long) nominals[i] * countOfNominals[i];
            i++;
        }
        return sum;
    }
    public List<Integer> getMoney(@NonNull Long money){
        if (currentfullAmount == 0 || money > currentfullAmount)  throw new IllegalArgumentException("not enough money");
        this.currentfullAmount -= money;
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (money >= 0 && i < nominals.length) {
            if (money - nominals[i] >=0 && countOfNominals[i] > 0){
                money -= nominals[i];
                countOfNominals[i] --;
                res.add(nominals[i]);
            } else {
                i++;
            }
        }
        return res;
     }


    public Long getStartFullAmount() {
        return startFullAmount;
    }

    public Long getCurrentfullAmount() {
        return currentfullAmount;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "nominals=" + Arrays.toString(nominals) +
                ", countOfNominals=" + Arrays.toString(countOfNominals) +
                '}';
    }
}
