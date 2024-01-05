package ru.java_lessons.lesson3;

import java.util.Scanner;

public class PassValidate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String accept = "y";
        System.out.println("Validate password?(to proceed type \033[3m'y'\033[0m, to quit \033[3m'q'\033[0m)");
        while(!accept.equalsIgnoreCase("q")){
            accept = scan.next();
            while(accept.equalsIgnoreCase("y")){
                System.out.println("\nMake a password.\n\nIt must:\nContain at least 1 letter and 1 number.\nBe at least 8 symbols long.");
                String pass = scan.next();
                System.out.println(validPass(pass));
                System.out.println("Validate another password?(\033[3m'y'\033[0m/\033[3m'q'\033[0m)");
                accept = scan.next();
            }
            if(!accept.equalsIgnoreCase("q")){
                System.out.println("\u001B[31m" + "\033[3mInvalid command.\033[0m" + "\u001B[38m");
            }
            else  {
                System.out.println("\u001B[36m\033[3mGoodbye!\033[0m");
                break;
            }
        }
    }

    static String validPass(String password){
        int lettersCount = 0;
        int digitsCount = 0;
        int passLength = password.length();

        for (char passChar : password.toCharArray()){
            if(Character.isLetter(passChar)) lettersCount++;
            if(Character.isDigit(passChar)) digitsCount++;
        }
        String invalid = "\u001B[31m" + "This password is invalid." + "\u001B[38m";
        String valid = "Your password is valid!\nIt has:\n" + lettersCount + " letters.\n" + digitsCount + " digits.\nAnd is " + passLength + " symbols long.\n";
        if(passLength >= 8 & digitsCount > 0 & lettersCount > 0){
            return valid;
        }
        else return invalid;


    }
}
