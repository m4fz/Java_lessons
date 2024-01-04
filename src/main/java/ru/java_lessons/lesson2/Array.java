package ru.java_lessons.lesson2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] num = new int[5];
        String[] words = {"one","two"};
        Integer[] nums = new Integer[10];

        num[0] = 10;
        words[1] = "three";
        nums[5] = 100;

        System.out.println(Arrays.toString(num) + " " + num.length);
        System.out.println(Arrays.toString(words) + " " + words.length);
        System.out.println(Arrays.toString(nums) + " " + nums.length);


    }
}
