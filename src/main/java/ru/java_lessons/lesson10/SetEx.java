package ru.java_lessons.lesson10;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();//linkedHashSet remembers the order in which elements were added,
        // and treeSet has autosorting by some property of element which has to be stated and overridden in equals and hashcode
        //sets use buckets

        Person person1 = new Person("Irina",22,80, LocalDateTime.of(1983,8,1,11,11,10));
        Person person2 = new Person("Ivan",18,60, LocalDateTime.of(1991,11,11,5,9,13));
        Person person3 = new Person("Robert",40,75, LocalDateTime.of(1975,4,1,7,10,16));

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        System.out.println(personSet);
    }
}
