package ru.java_lessons.lesson6;

import java.util.Objects;

public class Worker extends EmployeeImpl{
    private String job;


    public Worker(String firstName, String lastName, int age, double salary, String job) { //making a new constructor using original one from employeeImpl through super function
        super(firstName, lastName, age, salary);
        this.job = job;
    }

    // Making new and overriding old functions form interface
    public String getJob(){
        return this.job;
    }

    @Override
    public void saySomething() {
        System.out.println("Worker " + this.getFirstName() + this.getLastName() + " is talking");
    }

    @Override
    public void doTask() {
        System.out.println("Worker " + this.getFirstName() + " is working");
    }

    @Override
    public void rest() {
        System.out.println("Worker " + this.getFirstName() + " is resting");

    }
    @Override
    public String toString(){
        return "Worker{" + this.getFirstName() + " " + this.getLastName() + "}";
    }


    //Overriding basic functions of Object class to change the way of comparing other functions and hashcode generation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return this.getFirstName().equals(worker.getFirstName()) && this.getLastName().equals(worker.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getLastName());
    }
}
