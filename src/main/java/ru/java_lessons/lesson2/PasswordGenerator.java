package ru.java_lessons.lesson2;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    final static int ASCII_NUMBERS_START = 48;
    final static int ASCII_NUMBERS_END = 57;
    final static int ASCII_BIG_LETTER_START = 65;
    final static int ASCII_BIG_LETTER_END = 90;
    final static int ASCII_SMALL_LETTER_START = 97;
    final static int ASCII_SMALL_LETTER_END = 122;
    static String onlyD = "";
    static String onlyL = "";
    static int psLength = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start password generator? (to start type - \033[3m'y'\033[0m)");
        String go = scan.next();
        int passNum = 1;
        while(!go.equalsIgnoreCase("y")){
            System.out.println("\u001B[31m" + "\033[3m'invalid command'\033[0m");
            go = scan.next();
        }
        while (!go.equalsIgnoreCase("q") & go.equalsIgnoreCase("y")){
            System.out.println("Set password length and choose if it will be generated form only numbers or letters");
            System.out.println("Password length:");
            psLength = scan.nextInt();
            while (!onlyD.equalsIgnoreCase("y") | !onlyD.equalsIgnoreCase("n")) {
                System.out.println("Only digits?(y/n) -");
                onlyD = scan.next();
                if(onlyD.equalsIgnoreCase("y")){
                    break;
                } else if (onlyD.equalsIgnoreCase("n")) {
                    while (!onlyL.equalsIgnoreCase("y") | !onlyL.equalsIgnoreCase("n")) {
                        System.out.println("Only letters?(y/n) -");
                        onlyL = scan.next();
                        if(onlyL.equalsIgnoreCase("y") | onlyL.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                }
                break;
            }
            System.out.println(generatePassword(psLength));
            System.out.println("Run again?(to run,type - y, to quit,type - q)");
            go = scan.next();
            if(go.equalsIgnoreCase("y")){
                passNum++;
                System.out.println("Password number " + passNum + ":");
            } else if (go.equalsIgnoreCase("q")) {
                System.out.println("\u001B[36m" + "\033[3mGoodbye!\033[0m");
                break;
            } else {
                while(!go.equalsIgnoreCase("y")){
                    System.out.println("\u001B[31m" + "\033[3m'invalid command'\033[0m");
                    System.out.println("Run again?(to run,type - y, to quit,type - q)");
                    go = scan.next();
                    if(go.equalsIgnoreCase("q")){
                        System.out.println("\u001B[36m" + "\033[3mGoodbye!\033[0m");
                        break;
                    }
                    if(go.equalsIgnoreCase("y")){
                        passNum++;
                        System.out.println("Password number " + passNum + ":");
                    }
                }
            }

        }


    }
    /** Выбор метода генерации пароля
     * @param passwordLength Длинна пароля
     * onlyD Параметр генерирования только чисел
     * onlyL Параметр генерирования только букв
     * @return Возврат метода генерации пароля
     */
    static String generatePassword(int passwordLength) {
        // Numbers from 48 to 57
        // Letters, big 65 to 90 , small 97 to 122
        String password = "";
        if (onlyL.equals("y")){
            password = generateOnlyLetters(passwordLength);
        } else if (onlyD.equals("y")) {
            password = generateOnlyNumbers(passwordLength);
        } else {
            password = generatePasswordAll(passwordLength);
        }
        return password;
    }
    /**
     * Модуль генерации пароля используя только числа
     * @param passwordLength Запись случайных чисел на всю заданную длину пароля
     * @return Возврат конечного пароля
     */
    static String generateOnlyNumbers(int passwordLength) {
        String password = "";
        Random random = new Random();
        int i = 0;
        while (i < passwordLength) {
            i++;
            password += (char) random.nextInt(ASCII_NUMBERS_START, ASCII_NUMBERS_END + 1);
        }
        return password;
    }
    /**
     * Модуль генерации пароля используя только буквы
     * @param passwordLength Запись случайных букв на всю заданную длину пароля
     * @return Возврат конечного пароля
     */
    static String generateOnlyLetters(int passwordLength) {
        int k = 0;
        String password = "";
        Random random = new Random();
        while (k < passwordLength) {
            k++;
            if (random.nextBoolean()) {
                password += (char) random.nextInt(ASCII_BIG_LETTER_START, ASCII_BIG_LETTER_END + 1);
            } else {
                password += (char) random.nextInt(ASCII_SMALL_LETTER_START, ASCII_SMALL_LETTER_END + 1);
            }
        }
        return password;
    }
    /**
     * Модуль генерации пароля используя и числа и буквы
     * @param passwordLength Запись случайных чисел и букв на всю заданную длину пароля
     * @return Возврат конечного пароля
     */
    static String generatePasswordAll(int passwordLength){
        int j = 0;
        String password = "";
        Random random = new Random();
        while (j < passwordLength){
            j++;
            int choice = random.nextInt(0,3);
            if (choice == 0){
                password += (char) random.nextInt(ASCII_BIG_LETTER_START, ASCII_BIG_LETTER_END + 1);
            } else if (choice == 1) {
                password += (char) random.nextInt(ASCII_SMALL_LETTER_START, ASCII_SMALL_LETTER_END + 1);
            } else {
                password += (char) random.nextInt(ASCII_NUMBERS_START, ASCII_NUMBERS_END + 1);
            }
        }
        return password;
    }
}
