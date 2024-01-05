package ru.java_lessons.lesson3;

import java.util.Arrays;
import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));

        arraySort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * BubbleSorting алгоритм
     * @param arr Заданный параметр массива
     */
    static void arraySort(int[] arr){
        boolean isSwapped;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            isSwapped = false;
            for (int k = 0; k < n - i - 1; k++) {
                if (arr[k] > arr[k + 1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        
    }
}
