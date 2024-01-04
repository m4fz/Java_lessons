package ru.java_lessons.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Rock_Scissors_Paper {
    final static String ROCK = "rock";
    final static String SCISSORS = "scissors";
    final static String PAPER = "paper";
    final static String SAY_HELLO = "Your name?";
    final static String RULES = "Your choice?(to quit type q)";
    final static String QUIT_TOGGLE = "q";
    final static String DRAW = "draw";
    final static String PLAYER_WON = "%s wins\nWins - %d\nLosses - %d\n";
    final static String PC_WON = "PC won with %s\nWins - %d\nLosses - %d\n";
    final static String WRONG_CHOICE = "Wrong choice, please choose \033[3m'rock\033[0m, \033[3mpaper\033[0m or \033[3mscissors'\033[0m";

    public static void main(String[] args) {
        game();
    }

    static void game(){
        String[] pc = {ROCK, SCISSORS, PAPER};
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println(SAY_HELLO);
        String playerName = scan.next();
        int winCount = 0;
        int lossCount = 0;
        int roundCount = 0;

        while(true){
            System.out.println(RULES);
            String myChoice = scan.next();
            String pcChoice = pc[random.nextInt(pc.length)];

            if (myChoice.equalsIgnoreCase(QUIT_TOGGLE)){
                break;
            }
            else if (myChoice.equalsIgnoreCase(ROCK)){
                roundCount++;
                System.out.println("Round #" + roundCount + "\n");
                if (pcChoice.equalsIgnoreCase(ROCK)){
                    System.out.println(DRAW);
                } else if (pcChoice.equals(SCISSORS)) {
                    winCount++;
                    System.out.println(String.format(PLAYER_WON, playerName, winCount, lossCount));
                } else {
                    lossCount++;
                    System.out.println(String.format(PC_WON, pcChoice, winCount, lossCount));
                }
            }

            else if (myChoice.equalsIgnoreCase(SCISSORS)){
                roundCount++;
                System.out.println("Round #" + roundCount + "\n");
                if (pcChoice.equals(SCISSORS)){
                    System.out.println(DRAW);
                } else if (pcChoice.equals(PAPER)) {
                    winCount++;
                    System.out.println(String.format(PLAYER_WON, playerName, winCount, lossCount));
                } else {
                    lossCount++;
                    System.out.println(String.format(PC_WON, pcChoice, winCount, lossCount));
                }
            }

            else if (myChoice.equalsIgnoreCase(PAPER)) {
                roundCount++;
                System.out.println("Round #" + roundCount + "\n");
                if (pcChoice.equals(PAPER)) {
                    System.out.println(DRAW);
                } else if (pcChoice.equals(ROCK)) {
                    winCount++;
                    System.out.println(String.format(PLAYER_WON, playerName, winCount, lossCount));
                } else {
                    lossCount++;
                    System.out.println(String.format(PC_WON, pcChoice, winCount, lossCount));
                }
            }
            else {
                System.out.println(WRONG_CHOICE);
            }
        }
    }
}
