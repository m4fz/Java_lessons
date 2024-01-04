package ru.java_lessons.lesson2;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;
import java.sql.Driver;
import java.sql.SQLOutput;
import java.sql.Wrapper;
import java.util.Random;
import java.util.Scanner;

public class Stone_Scissors_Paper {
    final static String STONE = "Камень";
    final static String SCISSORS = "Ножницы";
    final static String PAPER = "Бумага";
    final static String SAY_HELLO = "Ваше имя -";
    final static String RULES = "Ваш выбор ? Для выхода жми q";
    final static String QUIT_TOGGLE = "q";
    final static String DRAW = "Ничья";
    final static String PLAYER_WON = "%s Победил";
    final static String PC_WON = "PC Победил выбрав %s";
    final static String WRONG_CHOICE = "Неверный выбор, выберете камень,ножницы или бумагу";
    public static void main(String[] args) {
        game();
    }

    static void game(){
        String[] pc = {STONE, SCISSORS, PAPER};
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println(SAY_HELLO);
        String playerName = scan.next();
        while(true){
            System.out.println(RULES);
            String myChoice = scan.next();
            String pcChoice = pc[random.nextInt(pc.length)];

            if (myChoice.equalsIgnoreCase(QUIT_TOGGLE)){
                break;
            }

            else if (myChoice.equalsIgnoreCase(STONE)){
                if (pcChoice.equals(STONE)){
                    System.out.println(DRAW);
                } else if (pcChoice.equals(SCISSORS)) {
                    System.out.println(String.format (PLAYER_WON, playerName));
                } else {
                    System.out.println(String.format(PC_WON, pcChoice));
                }
            }

            else if (myChoice.equalsIgnoreCase(SCISSORS)){
                if (pcChoice.equals(SCISSORS)){
                    System.out.println(DRAW);
                } else if (pcChoice.equals(PAPER)) {
                    System.out.println(String.format(PLAYER_WON, playerName));
                } else {
                    System.out.println(String.format(PLAYER_WON, playerName));
                }
            }

            else if (myChoice.equalsIgnoreCase(PAPER)) {
                if (pcChoice.equals(PAPER)) {
                    System.out.println(DRAW);
                } else if (pcChoice.equals(STONE)) {
                    System.out.println(String.format(PLAYER_WON, playerName));
                } else {
                    System.out.println(String.format(PLAYER_WON, playerName));
                }
            }
            else {
                System.out.println(WRONG_CHOICE);
            }
        }
    }
}
