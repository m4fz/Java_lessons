package ru.java_lessons.lesson11;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private final String model;
    private final int age;
    private final double cost;
    private static int count;

    public Car(String model, int age, double cost) {
        this.model = model;
        this.age = age;
        this.cost = cost;
        count++;
    }

    static class Engine{
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    '}';
        }
    }

    class Wheels{
        private final int radius;

        public Wheels(int radius) {
            this.radius = radius;
        }
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Double.compare(cost, car.cost) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, age, cost);
    }

    @Override
    public int compareTo(Car o) {
        return CharSequence.compare(this.getModel(), o.getModel());
    }
}
