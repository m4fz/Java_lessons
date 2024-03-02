package ru.java_lessons.lesson15;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainAnnotation {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException {
        Cat cat = new Cat();
        System.out.println(cat);
        String name = Cat.class.getAnnotation(NewAnnotation.class).name();
        int age = Cat.class.getAnnotation(NewAnnotation.class).age();

        Field[] fields = cat.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(f -> f.setAccessible(true));
        fields[0].set(cat, name);
        fields[1].set(cat, age);
        System.out.println(cat);
    }
}
