package ru.java_lessons.lesson9.homework;

import lombok.ToString;

import java.util.*;

public class Lottery extends Ticket{
    public static List<Consumer> consumers = new ArrayList<>();
    public static Queue<Ticket> tickets = new PriorityQueue<>();
    public static Integer ticketAmount;
    public static Integer idNum = 0;
    public static String fName;
    public static String lName;
    public static Consumer consumer;
    private static int tickId = 0;
    private static final Random random = new Random();
    private static final String winTicket = lotNumGen();
    private static int numOfWins = 0;

    // Random num generator for sequence of 4 numbers in each ticket
    private static String lotNumGen(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++){
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    /*
    This method creates new consumer through Main input, using constructor of consumer class, and adds those to list of consumers,
    then for overall amount of tickets, generates new tickets saving consumer id, ticket id and sequence of 4 random numbers in a queue.
     */
    public static void GenerateTickets(){
        consumer = new Consumer(fName,lName,ticketAmount,idNum);
        consumers.add(consumer);

        for (int i = 0; i < ticketAmount; i++) {
            Ticket ticket = new Ticket(idNum,tickId++,lotNumGen());
            tickets.add(ticket);
        }
    }

    /*
    This method, compares each tickets random num sequence to a randomly generated winning sequence, taking each from queue, until
    said queue becomes empty, and prints out a message for each win(if it happens), else prints out "you lose" message.
     */
    public static void GenerateWins(){
        for (int i = 1; i <= tickets.size();) {
            Ticket finalLottery = tickets.poll();
            if (finalLottery.getLotNumber().equals(winTicket)){
                Consumer winner = consumers.get(finalLottery.getConsumerId());
                System.out.println(winner.getFirstName() + " " + winner.getLastName() + " wins with ticket #" + (finalLottery.getTicketId() + 1) + "!");
                numOfWins++;
            }
        }
        if(numOfWins == 0) System.out.println("Nobody won, better luck nex time!");
    }

}
