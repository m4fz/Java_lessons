package ru.java_lessons.lesson9.homework;

import java.util.Objects;

public class Consumer implements Comparable<Consumer> {
    private final String firstName;
    private final String lastName;
    private final int numOfTickets;
    private final int id;


    public Consumer(String firstName, String lastName, int numOfTickets,int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numOfTickets = numOfTickets;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Consumer_" + (id+1) + " (" +
                "First name - '" + firstName + '\'' +
                ", Last Name - '" + lastName + '\'' +
                ", Number of tickets - " + numOfTickets + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return id == consumer.id && numOfTickets == consumer.numOfTickets && Objects.equals(firstName, consumer.firstName) && Objects.equals(lastName, consumer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, numOfTickets);
    }

    @Override
    public int compareTo(Consumer o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.firstName,o.firstName);
    }
}
