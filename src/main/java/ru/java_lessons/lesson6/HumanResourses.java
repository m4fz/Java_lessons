package ru.java_lessons.lesson6;

import java.util.Objects;

public class HumanResourses extends EmployeeImpl{
    private String yearsOfExperience;


    public HumanResourses (String firstName, String lastName, int age, double salary, String yearsOfExperience) { //making a new constructor using original one from employeeImpl through super function
        super(firstName, lastName, age, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    // Making new and overriding old functions form interface
    public String getYearsOfExperience(){
        return this.yearsOfExperience;
    }

    @Override
    public void saySomething() {
        System.out.println("HR Employee " + this.getFirstName() + this.getLastName() + " is talking");
    }

    @Override
    public void doTask() {
        System.out.println("HR Employee " + this.getFirstName() + " is working");
    }

    @Override
    public void rest() {
        System.out.println("HR Employee " + this.getFirstName() + " is resting");

    }
    @Override
    public String toString(){
        return "HR Employee{" + this.getFirstName() + " " + this.getLastName() + "}";
    }


    //Overriding basic functions of Object class to change the way of comparing other functions and hashcode generation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanResourses HR = (HumanResourses) o;
        return this.getFirstName().equals(HR.getFirstName()) && this.getLastName().equals(HR.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getLastName());
    }
}
