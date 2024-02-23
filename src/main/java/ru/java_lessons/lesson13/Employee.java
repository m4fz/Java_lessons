package ru.java_lessons.lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String fisrtname;
    private final String lastName;
    private final int age;
    private final double salary;
    private final Gender gender;
    private Employee(String firstName, String lastName, int age, double salary, Gender gender){
        this.fisrtname = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }
    public static Employee of(String firstName, String lastName, int age, double salary, Gender gender) {
        return new Employee(firstName, lastName, age, salary, gender);
    }

    public String getFirstName() {
        return fisrtname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(fisrtname, employee.fisrtname) && Objects.equals(lastName, employee.lastName) && gender == employee.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fisrtname, lastName, age, salary, gender);
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + fisrtname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }


}
