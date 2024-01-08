package ru.java_lessons.lesson5.units;

import ru.java_lessons.lesson5.weapons.Weapon;
import ru.java_lessons.lesson5.armor.Armor;
import ru.java_lessons.lesson5.heal.HealBottle;

public class UnitImpl implements Unit{
    private String name;
    private String description;
    private int maxHp;
    private int currentHp;
    private boolean isAlive;
    public UnitImpl(String name, int maxHp, String description){
        this.name = name;
        this.currentHp = maxHp;
        this.maxHp = maxHp;
        this.description = description;
        this.isAlive = true;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }

    @Override
    public int attack(int count, Weapon weapon) {
        return count * weapon.getDamage();
    }

    @Override
    public void cure(HealBottle bottle, int count) {
        this.currentHp += (count * bottle.cure());
        if ((this.currentHp > maxHp)){
            this.currentHp = this.maxHp;
        }
    }

    @Override
    public void getDamage(Armor armor, Weapon weapon) {
        this.currentHp -= armor.reduceDamage(weapon);
        if (this.currentHp < 0){
            this.currentHp = 0;
            this.isAlive = false;
        }
        System.out.println(this.name + " got hit for " + armor.reduceDamage(weapon) + " damage");
    }


}
