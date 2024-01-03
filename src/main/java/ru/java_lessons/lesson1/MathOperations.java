package ru.java_lessons.lesson1;

import java.sql.SQLOutput;

public class MathOperations {
    public static void main(String[] args) {
        // + - * / %
        // ++ --
        // += -= *= /=

        int num1 = 100;
        int num2 = 205;
        float f = 100f;
        char c = 'c';

        //System.out.println("num1 % num2 = " +num2 % num1); //Показывает остаток от деления
        //System.out.println(num1++); // 100
        //System.out.println(++num1); // 102
        //Порядок важен

        num1 += 10; // 110
        num1 -= 5; // 105
        num1 *= 3; // 315

        System.out.println(f / 0);
        System.out.println(-f / 0);
        //Даёт бесконечность
        System.out.println(c / 0);

    }
}
