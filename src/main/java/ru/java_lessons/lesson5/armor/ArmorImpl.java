package ru.java_lessons.lesson5.armor;

import ru.java_lessons.lesson5.weapons.Weapon;

public class ArmorImpl implements Armor{
    private String description;
    private int armorDefence;
    public ArmorImpl(String description, int armorDefence){
        this.description = description;
        this.armorDefence = armorDefence;
    }
    public int getArmorDefence(){
        return this.armorDefence;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int reduceDamage(Weapon weapon) {
        return weapon.getDamage() - armorDefence;
    }
}
