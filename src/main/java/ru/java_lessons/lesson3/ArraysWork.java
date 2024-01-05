package ru.java_lessons.lesson3;

import java.util.Arrays;
import java.util.Random;

public class ArraysWork {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
//        int[][] matrix1 = { {1,2,3},
//                            {4,5,6} };

        Random random = new Random();
        for(int i =0; i < matrix.length; i++){
            for(int k =0; k <matrix[i].length; k++) {
                matrix[i][k] = random.nextInt(1, 10);
            }
        }
//        int f = 0;
//        int l = 0;
//        while(f < matrix.length){
//            f++;
//            while (l < matrix[f].length){
//                l++;
//                System.out.println("f = " + f + " l = " + l + " " + matrix[f][l]);
//            }

//        for(int i =0; i < matrix.length; i++){
//            for(int k =0; k <matrix[i].length; k++) {
//                System.out.println(matrix[i][k]);
//            }
//        }

        for (int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }

    }
}
