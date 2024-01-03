package ru.java_lessons.lesson1.OOP;

import java.lang.ref.Reference;

public class GameUnit {
    String type;
    String humanity;
    String chClass;
    String weapons;
    String primaryWeapon;
    String secondaryWeapon;
    String attackWeapon;
    int healingCapacity;
    int healAmount;
    int damage;
    float speed;
    int hp;
    int maxHp;
    boolean isHuman;
    boolean weaponType;

    void setMaxHp(){
        maxHp = hp;
    }
    void run() {
        System.out.println(type + " is approaching an enemy with a speed of " + speed + " km/h." + "\r\n");
    }
    void setWeapon(String weapon1, String weapon2){
        primaryWeapon = weapon1;
        secondaryWeapon = weapon2;
        weapons = primaryWeapon + ", " + secondaryWeapon;
    }
    void rollForDamage(){
        int randomNum = (int) (Math.random() * 101);
        if(randomNum >= 30){
            damage = randomNum;
            return;
        }
        damage = 0;
    }
    void setAttackWeapon(){
        double randomWeapon = Math.random();
        if (randomWeapon >= 0.5){
            weaponType = true;
            return;
        }
        weaponType = false;
    }
    void attack() {
        setAttackWeapon();
        if (weaponType == true){
            attackWeapon = primaryWeapon;
        }
        else {attackWeapon = secondaryWeapon;
        }
        rollForDamage();
        if(damage == 0){
            System.out.println(type + " failed his attack." + "\r\n");
        }
        else if(attackWeapon.equalsIgnoreCase("Shield")){
            System.out.println("This turn " + type + " did " + damage + " damage" + " with a " + attackWeapon + "bash" + "\r\n");
        }
        else {
            System.out.println("This turn " + type + " did " + damage + " damage" + " with a " + attackWeapon + "\r\n");
        }
    }
    void takeDamage() {
        setMaxHp();
        rollForDamage();
        if(damage == 0){
            System.out.println(type + " didn't take any damage.");
        }
        else {System.out.println("This turn " + type + " took " + damage + " damage");
            hp = hp - damage;
            if (hp <= 0){
                System.out.println(type + " took too much damage and used an ability " + "\033[3m'Last Chance'\033[0m" + " to escape death.");
                hp = 5;
            }
        }
    }
    String setHumanity(){
        if(!isHuman) {
            return humanity = "Character is not human.";
        }
        return humanity = "Character is human.";
    }
    void cure(String bottleType, int times) {
        if (hp < maxHp){
            if(bottleType.equalsIgnoreCase("small")){
                healingCapacity = 25;
            }
            if (bottleType.equalsIgnoreCase("medium")){
                healingCapacity = 50;
            }
            if (bottleType.equalsIgnoreCase("large")){
                healingCapacity = 100;
            }
            healAmount = healingCapacity * times;
            hp = hp + healAmount;
            if (hp > maxHp){
                hp = maxHp;
            }
            System.out.println(type + " is curing for " + healAmount + " hp." + "\r\n" + "Total hp - " + hp + "." + "\r\n");
        }
        else{
            System.out.println(type + " does not need healing." + "\r\n");
        }
    }
    void speak(){
        System.out.println(type + " is now speaking with a merchant." + "\r\n");
    }
}
