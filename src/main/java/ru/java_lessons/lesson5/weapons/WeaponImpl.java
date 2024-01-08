package ru.java_lessons.lesson5.weapons;

public class WeaponImpl implements Weapon{
    private String description;
    private int damage;
    public WeaponImpl(String description, int damage){
        this.description = description;
        this.damage = damage;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
