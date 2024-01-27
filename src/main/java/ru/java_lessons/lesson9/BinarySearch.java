package ru.java_lessons.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3,100,5,11,8,23,46,2));
        System.out.println(binarySearch(list,100));
        System.out.println(list);
    }

    private static int binarySearch(List<Integer> array, int number){
        if(array == null || array.size() == 0) throw new  IllegalArgumentException("Array is empty");

        int start = 0;
        int end = array.size() -1;

        Collections.sort(array);

        while (start <= end){
            int middle = (start + end)/2;
            if (array.get(middle) == number) {
                return middle;
            }
            else if (number > array.get(middle)){
                start = middle + 1;
            } else {
                end = middle - 1;
            }

        }
        return -1;
    }
}
