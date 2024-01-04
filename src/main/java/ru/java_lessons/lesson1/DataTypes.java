package ru.java_lessons.lesson1;

public class DataTypes {
    public static void main(String[] args) {
        // Примитивные типы данных
        // Целые числа
        byte byteVar = 1; //от -128 до 127, 1byte = 8bit
        short shortVar = 1000; // -32 768 до 32 767, 2byte = 16bit
        int intVar =1000_000_000; // -2 147 483 648 до 2 147 483 647, 4byte
        long longVar = 1000_000_000; // Многа, 8byte

        // Десятичные типы
        float floatVar = 10.5f; // 4byte
        double doubleVar = 10.7; // 8byte (Более точный)

        // Булевые типы
        boolean boolVar = true; // 2byte

        // Символьные типы
        char charVar = 'a'; //2byte
        char rub = '\u0584';

        // Ссылочные типы
        String str = "Лев";
        //Классы обёртки wrapper
        Byte byteVarRef = 123;
        Short shortVarRef = 1000;
        Integer intVarRef = 1000_000_000;
        Long longVarRef = 11L;
        Character charVarRef = 'c';
        Character charAscRef = 54;
        Float floatVarRef = 2.0f;
        Double doubleVarRef = 2.0;

        str = "123";

        intVar = shortVar;
        intVar = (int) longVar;

        longVar = (long) floatVar;

        /* System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        * Чек на максимальные и минимальные значения */

        //System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        //System.out.println(intVar + 2000_000_000);
        short a = 100;
        short b = 20;

        int res = a + b;

    }
}