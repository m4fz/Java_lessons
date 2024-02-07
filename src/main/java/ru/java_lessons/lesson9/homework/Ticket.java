package ru.java_lessons.lesson9.homework;

import java.util.Objects;

public class Ticket implements Comparable<Ticket>{
    private int consumerId;
    private int ticketId;
    private String lotNumber;

    public Ticket(){}
    public Ticket(int consumerId, int ticketId, String lotNumber){
        this.consumerId = consumerId;
        this.ticketId = ticketId;
        this.lotNumber = lotNumber;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return consumerId == ticket.consumerId && ticketId == ticket.ticketId && Objects.equals(lotNumber, ticket.lotNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumerId, ticketId, lotNumber);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "consumerId=" + consumerId +
                ", ticketId=" + ticketId +
                ", lotNumber='" + lotNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(this.ticketId, o.ticketId);
    }
}
