package ru.java_lessons.lesson9.homework;


import java.util.Scanner;

public class Main extends Lottery {
    public static void main(String[] args) {
        // Loop checker var
        String addCons = "add";

        while (addCons.equalsIgnoreCase("add")) {
            // First name input
            System.out.println("Your first name:");
            Scanner scan = new Scanner(System.in);
            fName = scan.next();

            // Last name input
            System.out.println("Your last name:");
            lName = scan.next();

            // Ticket amount input
            System.out.println("Amount of tickets you want to buy:");
            ticketAmount = scan.nextInt();

            // Method which makes a list of consumers and a separate list of their tickets
            GenerateTickets();
            System.out.println("Current list of consumers:\n" + consumers); // Outputs consumer list

            // Option to add another separate consumer(and input error checker)
            if (addCons.equalsIgnoreCase("add")){
                System.out.println("Add another consumer, or show results of the lottery? (add/res)");
                addCons = scan.next();
                while (!addCons.equalsIgnoreCase("add") && !addCons.equalsIgnoreCase("res")){
                    System.out.println("\u001B[31m" + "\033[3m'Invalid command.'\033[0m");
                    System.out.println("Add another consumer, or show results of the lottery? (add/res)");
                    addCons = scan.next();
                }
            }
            // Breaks loop if user wants to see results of the lottery
            if (addCons.equalsIgnoreCase("res")) {
                break;
            }
            // Consumer id counter
            idNum++;
        }
        // Chance of winning is 1\6561 :)
        GenerateWins();
    }
}
