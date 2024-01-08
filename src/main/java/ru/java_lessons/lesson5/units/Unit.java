package ru.java_lessons.lesson5.units;


import ru.java_lessons.lesson5.Game;
import ru.java_lessons.lesson5.armor.Armor;
import ru.java_lessons.lesson5.heal.HealBottle;
import ru.java_lessons.lesson5.weapons.Weapon;

public interface Unit extends Game {
    void walk();
    int attack(int count, Weapon weapon);



    void cure(HealBottle bottle, int count);
    void getDamage(Armor armor, Weapon weapon);


}
