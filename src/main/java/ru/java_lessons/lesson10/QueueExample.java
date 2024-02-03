package ru.java_lessons.lesson10;

import org.w3c.dom.ls.LSOutput;
import ru.java_lessons.lesson2.Array;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDateTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Person person1 = new Person("Irina",22,80, LocalDateTime.of(1983,8,1,11,11,10));
        Person person2 = new Person("Ivan",18,60, LocalDateTime.of(1991,11,11,5,9,13));
        Person person3 = new Person("Robert",40,75, LocalDateTime.of(1975,4,1,7,10,16));

        Queue<Person> people = new PriorityQueue<>(List.of(person1,person2,person3)); // if compareTo is not overridden, then u need to add a comparator after list.of

        //example
//        Queue<Person> people = new PriorityQueue<>(new PersonDateComparator());
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);

        System.out.println(people);
        System.out.println(people.peek());

//        people.offer() /adds a element if it is possible to do so immediately without violating capacity restrictions
//        people.add() /adds a element if initial capacity allows more to be fitted in else should throw IllegalStateException

        people.poll();

        ArrayBlockingQueue<Person> arrayBlockingQueue = new ArrayBlockingQueue<>(2); // works only in queues with hard capacity limits, else just adds an element anyway
        arrayBlockingQueue.add(person1);
        arrayBlockingQueue.add(person2);
        arrayBlockingQueue.offer(person3);
//        arrayBlockingQueue.add(person3); / throws exception
    }
}
