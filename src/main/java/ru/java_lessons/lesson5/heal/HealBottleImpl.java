package ru.java_lessons.lesson5.heal;

public class HealBottleImpl implements HealBottle{

    private String description;
    private int bottle;

    public HealBottleImpl(String description, int bottle){
        this.description = description;
        this.bottle = bottle;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int cure() {
        return this.bottle;
    }
}
