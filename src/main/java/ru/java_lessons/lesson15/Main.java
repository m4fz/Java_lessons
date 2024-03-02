package ru.java_lessons.lesson15;

import javax.imageio.ImageTranscoder;
import java.awt.image.SampleModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Student student = new Student(22,"Ivan",67.5, 8);
        Class<?> clazz = student.getClass();

        Field[] fields = clazz.getFields(); // only gets public fields
        Arrays.stream(fields).forEach(System.out::println);

        Field[] allFields = clazz.getDeclaredFields();// gets all fields
        Arrays.stream(allFields).forEach(System.out::println);

        try {
            allFields[0].setAccessible(true);
            allFields[0].setInt(student, 33);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(student.getAge());
        System.out.println("\n");

        Method[] methods = clazz.getDeclaredMethods();
        IntStream.range(0,methods.length).forEach(i -> System.out.println(methods[i]));
//        Arrays.stream(methods).forEach(System.out::println);

        System.out.println(methods[0].invoke(student));

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        constructors[2].setAccessible(true);
        Student student1 = (Student) constructors[2].newInstance(15);
        System.out.println(student1);
    }
}
