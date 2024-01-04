package ru.java_lessons.lesson2;

import java.util.Arrays;
import java.util.Random;

public class loops {
    public static void main(String[] args) {
        // for
        int[] num = new int[10];
        Random random = new Random();
        for (int i=0; i < num.length; i++){
            int randomNubmer = random.nextInt(10, 100);
//            if(randomNubmer == 55) {
//                continue; // break;
//            }
            num[i] = randomNubmer;
        }
        System.out.println(Arrays.toString(num));

        //forEach
//        for (int number : num) {
//            System.out.println(number);
//        }
//
//        int j = 0;
//        while (j < num.length){
//            System.out.println(num[j]);
//            j++;
//        }

        int k = 8;
        do {
            System.out.println("index - " + k + ", " + num[k]);
            k++;
        }
        while (k < num.length);


    }

}
