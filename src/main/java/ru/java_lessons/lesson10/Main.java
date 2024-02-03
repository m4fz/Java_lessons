package ru.java_lessons.lesson10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Irina",22,80, LocalDateTime.of(1983,8,1,11,11,10));
        Person person2 = new Person("Ivan",18,60, LocalDateTime.of(1991,11,11,5,9,13));
        Person person3 = new Person("Robert",40,75, LocalDateTime.of(1975,4,1,7,10,16));

        List<Person> personList = new ArrayList<>(List.of(person1,person2,person3));
        Collections.sort(personList);
        System.out.println(personList);
        personList.sort(new PersonComparator());
        System.out.println(personList);

        //methods of comparing
//        personList.sort((p1, p2) -> Integer.compare(p1.getAge(),p2.getAge()));
//        personList.sort(Comparator.comparingInt(Person::getAge));

        //anonymous class
//        personList.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        });

        // same thing but sorter through lambda
//        personList.sort((o1, o2) -> 0);

        // using comparator through new class
        personList.sort(new PersonDateComparator());
        System.out.println(personList);
    }

}
