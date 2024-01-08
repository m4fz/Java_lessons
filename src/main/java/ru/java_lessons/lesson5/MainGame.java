package ru.java_lessons.lesson5;

import ru.java_lessons.lesson5.armor.ArmorImpl;
import ru.java_lessons.lesson5.heal.HealBottleImpl;
import ru.java_lessons.lesson5.units.UnitImpl;
import ru.java_lessons.lesson5.weapons.WeaponImpl;

public class MainGame {
    public static void main(String[] args) {
        ArmorImpl armor1 = new ArmorImpl("Light armor", 5 );
        HealBottleImpl bottle1 = new HealBottleImpl("Small bottle", 25);
        WeaponImpl weapon1 = new WeaponImpl("Sword", 30);
        UnitImpl player1 = new UnitImpl("Name", 150, "Berserk");

        ArmorImpl armor2 = new ArmorImpl("Heavy armor", 15 );
        HealBottleImpl bottle2 = new HealBottleImpl("Medium bottle", 25);
        WeaponImpl weapon2 = new WeaponImpl("Spear", 30);
        UnitImpl player2 = new UnitImpl("Name", 150, "Thief");

        player1.getDamage(armor1, weapon2);
    }
}
