package ru.java_lessons.lesson6;

public abstract class EmployeeImpl implements Employee{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public EmployeeImpl(String firstName, String lastName, int age, double salary){ // Making a constructor + implementing interface in advance for this abstract class to be extended to
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    /*
    public String getFullName(){
    return this.firstName + ", " + this.lastName;
    }
     */
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
}
