package ru.java_lessons.lesson1.OOP;

import com.sun.security.jgss.GSSUtil;

public class GameUnit {
    String name;
    String weapon;
    int damage;
    float speed;
    int life;
    boolean isHuman;


    void run() {
        System.out.println(name + " is running");
    }

    int attack(String weapon, int damage) {
        System.out.println(name + " did " + damage + " damage" + " with " + weapon);
        return  damage;
    }
    void cure(int bottle, int count) {
        System.out.println(name + " is curing");
        life += (bottle * count);
    }

    void makeDamage(){
        int defRandom = 300;
        double randomNum = Math.random();
        if(randomNum >= 0.2){
            damage = (int) (randomNum * 1000);
        }
        damage = defRandom;
    }
}
