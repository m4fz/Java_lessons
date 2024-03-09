package ru.java_lessons.lesson2;

/**
 * Управляющие конструкции
 */
public class  Flow {
    public static void main(String[] args) {
        /**
         if else if else
         if (boolean)
         > < >= <= !=
        lazy && и, || или, ! нет, ^
         & |
         */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        // false - 0
        // true - 1
        // 1 * 0 = 0 &&
        boolean res = a && b; // false

        // 1 + 0 = 1 ||
        res = a || b; // true
        res = b && c; //false
        res = b || c; // false
        res = !b;    //true
        res = a ^ b; //true
        res = a ^ b; //false

        if(a && b){
            System.out.println("a > b");
        }
        System.out.println("Hello");
        int n1 = 100;
        int n2 = 200;

        // Тернарный оператор
        String result = n1 > n2 ? "n1 > 2" : "n2 > n1";
        // или System.out.println(n1 > n2 ? "n1 > 2" : "n2 > n1");



    }
}
