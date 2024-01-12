package ru.java_lessons.lesson6;

import java.util.Objects;

public class Director extends EmployeeImpl{
    private double bonus;
    private int countOfEmployee;

    public Director(String firstName, String lastName, int age, double salary,double bonus,int countOfEmployee){ //making a new constructor using original one from employeeImpl through super function
        super(firstName,lastName,age,salary);
        this.bonus = bonus;
        this.countOfEmployee = countOfEmployee;
    }

    // Making new and overriding old functions form interface
    public double getDirectorSalary(){
        return bonus + this.getSalary();
    }
    @Override
    public void saySomething() {
        System.out.println("I'm the director if this company");
    }
    @Override
    public void doTask() {
        System.out.println("Leading the team of : " +this.countOfEmployee + " people");
    }
    @Override
    public void rest() {
        System.out.println("Director " + this.getFirstName() + " is resting");
    }
    @Override
    public String toString(){
        return "Director{" + this.getFirstName() + " " + this.getLastName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return this.getFirstName().equalsIgnoreCase(director.getFirstName()) && this.getLastName().equalsIgnoreCase(director.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getLastName());
    }

    public void setBonus(double num){
        this.bonus = num;
    }
    public double getBonus(){
        return this.bonus;
    }
}
