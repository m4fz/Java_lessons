package ru.java_lessons.lesson1.OOP;

public class Game {
    public static void main(String[] args) {
        GameUnit unit1 = new GameUnit();
        GameUnit unit2 = new GameUnit();
        GameUnit unit3 = new GameUnit();

        System.out.println("\r\n" + "Unit 1:");
        unit1.type = "Ork";
        unit1.isHuman = false;
        unit1.chClass = "Berserk";
        unit1.setWeapon("Axe", "Spear");
        unit1.speed = 3.8f;
        unit1.hp = 150;
        System.out.println("Type - " + unit1.type + "\r\n" + "Class - " + unit1.chClass + "\r\n" + unit1.setHumanity() + "\r\n");
        System.out.println("Stats:" + "\r\n" + "Base HP = " + unit1.hp + "\r\n" + "Base speed = " + unit1.speed + "\r\n" + "Base weapons = " + unit1.weapons + "\r\n");
        unit1.run();
        unit1.attack();
        unit1.takeDamage();
        System.out.println(unit1.type + " now has " + unit1.hp + "hp.");
        unit1.cure/* types: small,medium,large */("small",1);
        unit1.speak();

        System.out.println("\r\n" + "Unit 2:");
        unit2.type = "Dark Elf";
        unit2.isHuman = false;
        unit2.chClass = "Archer";
        unit2.setWeapon("Bow", "Dagger");
        unit2.speed = 8.1f;
        unit2.hp = 75;
        System.out.println("Type - " + unit2.type + "\r\n" + "Class - " + unit2.chClass + "\r\n" + unit2.setHumanity() + "\r\n");
        System.out.println("Stats:" + "\r\n" + "Base HP = " + unit2.hp + "\r\n" + "Base speed = " + unit2.speed + "\r\n" + "Base weapons = " + unit2.weapons + "\r\n");
        unit2.run();
        unit2.attack();
        unit2.takeDamage();
        System.out.println(unit2.type + " now has " + unit2.hp + "hp.");
        unit2.cure/* types: small,medium,large */("large",1);
        unit2.speak();

        System.out.println("\r\n" + "Unit 3:");
        unit3.type = "Human";
        unit3.isHuman = true;
        unit3.chClass = "Knight";
        unit3.setWeapon("Sword", "Shield");
        unit3.speed = 5.3f;
        unit3.hp = 115;
        System.out.println("Type - " + unit3.type + "\r\n" + "Class - " + unit3.chClass + "\r\n" + unit3.setHumanity() + "\r\n");
        System.out.println("Stats:" + "\r\n" + "Base HP = " + unit3.hp + "\r\n" + "Base speed = " + unit3.speed + "\r\n" + "Base weapons = " + unit2.weapons + "\r\n");
        unit3.run();
        unit3.attack();
        unit3.takeDamage();
        System.out.println(unit3.type + " now has " + unit3.hp + "hp.");
        unit3.cure/* types: small,medium,large */("medium",1);
        unit3.speak();
    }
}
