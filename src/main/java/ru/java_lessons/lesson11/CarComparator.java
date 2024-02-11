package ru.java_lessons.lesson11;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return CharSequence.compare(o1.getModel(), o2.getModel());
    }
}
