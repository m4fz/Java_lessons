package ru.java_lessons.lesson10;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return CharSequence.compare(o1.getName(), o2.getName());
    }
}
