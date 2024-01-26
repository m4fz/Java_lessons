package ru.java_lessons.lesson8.homework;

import ru.java_lessons.lesson8.User;

import java.util.List;
import java.util.Objects;

public class Student {
    private static final int DEFAULT_AGE = 0;
    private static final String DEFAULT_NAME = "Invalid name";
    private static final String DEFAULT_FACULTY = "Invalid faculty";
    private String faculty;
    private String name;
    private int age;
    private final List<String> badWords = List.of("Stupid", "Frick");
    private final List<String> Faculties = List.of("Engineer","Mechanic","Computer Science");

    public Student(String name, String faculty, int age){
        this.age = checkAge(age) ?  age : DEFAULT_AGE;
        this.name = checkName(name) ? name : DEFAULT_NAME;
        this.faculty = checkFaculty(faculty) ? faculty : DEFAULT_FACULTY;
    }

    public String getName(){
        return this.name;
    }
    public String getFaculty(){
        return this.faculty;
    }

    public int getAge(){
        return this.age;
    }

    private boolean checkAge(int age){
        return age >= 50 || age < 18 ? false : true;
    }

    private boolean checkName(String name){
        return name.isEmpty() || name.isBlank() || badWords.contains(name) ? false : true;
    }
    private boolean checkFaculty(String faculty){
        if (faculty.isEmpty() || faculty.isBlank() || badWords.contains(faculty)) return false;
        else{
            for (int i = 0; i < Faculties.size(); i++){
                return Faculties.contains(faculty);
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, faculty);
    }
}
