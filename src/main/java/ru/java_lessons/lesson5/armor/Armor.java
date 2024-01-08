package ru.java_lessons.lesson5.armor;

import ru.java_lessons.lesson5.Game;
import ru.java_lessons.lesson5.units.Unit;
import ru.java_lessons.lesson5.weapons.Weapon;
import ru.java_lessons.lesson5.weapons.WeaponImpl;

public interface Armor extends Game {
    int reduceDamage(Weapon weapon);

}
