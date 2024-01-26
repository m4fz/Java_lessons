package ru.java_lessons.lesson8;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;

public final class User {
    private static final int DEFAULT_AGE = 18;
    private static final String DEFAULT_NAME = "name";
    private String name;
    private int age;
    private final List<String> badWords = List.of("редиска", "бомбила");

    public User(String name, int age){
        this.age = checkAge(age) ?  age : DEFAULT_AGE;
        this.name = checkName(name) ? name : DEFAULT_NAME;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private boolean checkAge(int age){
        return age > 105 || age <= 0 ? false : true;
    }

    private boolean checkName(String name){
        return name.isEmpty() || name.isBlank() || badWords.contains(name) ? false : true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
