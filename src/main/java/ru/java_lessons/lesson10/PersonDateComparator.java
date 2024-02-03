package ru.java_lessons.lesson10;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;

public class PersonDateComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Timestamp.valueOf(o1.getDateOfBirth()).compareTo(Timestamp.valueOf(o2.getDateOfBirth()));
    }
}
