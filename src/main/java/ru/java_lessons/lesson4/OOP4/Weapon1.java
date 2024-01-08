package ru.java_lessons.lesson4.OOP4;

public enum Weapon1 { //enum class used to set constant values which can be used in other classes through making new instances
    AXE(50, 5), SWORD(20, 10), SPEAR(40, 8);
    private int damage;
    private int speed;

    Weapon1(int damage, int speed){
    }
    public int getDamage(){
        return damage;
    }
    public int getSpeed(){
        return speed;
    }

}
