package ru.java_lessons.lesson6;

import java.util.Objects;

public class Engineer extends EmployeeImpl{
    private String degree;


    public Engineer (String firstName, String lastName, int age, double salary, String degree) { //making a new constructor using original one from employeeImpl through super function
        super(firstName, lastName, age, salary);
        this.degree = degree;
    }

    // Making new and overriding old functions form interface
    public String getDegree(){
        return this.degree;
    }

    @Override
    public void saySomething() {
        System.out.println("Engineer " + this.getFirstName() + this.getLastName() + " is talking");
    }

    @Override
    public void doTask() {
        System.out.println("Engineer " + this.getFirstName() + " is working");
    }

    @Override
    public void rest() {
        System.out.println("Engineer " + this.getFirstName() + " is resting");

    }
    @Override
    public String toString(){
        return "Engineer{" + this.getFirstName() + " " + this.getLastName() + "}";
    }


    //Overriding basic functions of Object class to change the way of comparing other functions and hashcode generation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engi = (Engineer) o;
        return this.getFirstName().equals(engi.getFirstName()) && this.getLastName().equals(engi.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getLastName());
    }
}
