package ru.java_lessons.lesson3;

public class StringWork {
    public static void main(String[] args) {
//        String str = "";
//        String str1 = null;

        /*
        String str = "hello world";
        String str1 = "hello world" ;
        System.out.println(str == str1); - TRUE
        */

        /*
        String str = "hello world";
        String str1 = new String("hello world") ;
        System.out.println(str == str1); - FALSE
        */


        /*
        String str = "hello world";
        String str1 = new String("hello world") ;
        System.out.println(str.equals(str1));  - TRUE ()
         */


        String str = "hello world";
        String str1 = new String("hello world") ;
        StringBuilder stringBuilder = new StringBuilder(str); //bad for multithreading, need to set a string to work with
        StringBuffer stringBuffer = new StringBuffer();    //good for multithreading

        /*
        str += "java";
        System.out.println(str);  hello worldjava
        System.out.println(stringBuilder.append(" Java")); hello world Java
        */


        /*
        String str2 = stringBuilder.append(" Java").reverse().toString();  avaJ dlrow olleh
        System.out.println(str2);
        */

        /*
        String str2 = stringBuilder.append(" Java").toString();
        System.out.println(str2.charAt(0));
        */

        String str2 = stringBuilder.append(" Java").toString();
        System.out.println(str2.substring(0, 5));

        /*
        Integer n = 10;
        Integer n1 = 10;
        System.out.println(n == n1); - TRUE
        */

        Integer n = 1000;
        Integer n1 = 1000;
        System.out.println(n == n1); //- FALSE (128 int stack, if out of bound then stored separately)



    }
}
