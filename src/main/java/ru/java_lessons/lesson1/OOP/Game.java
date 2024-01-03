package ru.java_lessons.lesson1.OOP;

public class Game {
    public static void main(String[] args) {
        GameUnit unit1 = new GameUnit();
        GameUnit unit2 = new GameUnit();
        GameUnit unit3 = new GameUnit();

        unit1.name = "ork";
        unit1.speed = 50.5f;
        unit1.weapon = "axe";
        unit1.life = 2000;
        unit1.run();
        unit1.attack("Spear", 300);
        unit1.cure(100, 3);
        unit1.makeDamage();

        System.out.println(unit1.name + " did " + unit1.damage + " damage");
        System.out.println(unit1.life);
        System.out.println(unit1.isHuman);

        unit2.name = "elf";
        unit2.weapon = "bow";
        unit2.isHuman = true;
        unit2.cure(50, 2);
        System.out.println(unit2.life);


    }
}
