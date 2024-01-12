package ru.java_lessons.lesson6;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Bob","Johnson", 50, 3000, 300, 5);
        Director director1 = new Director("Bob","Johnson", 50, 3000, 300, 5);
        Worker worker = new Worker("Peter","Miller",34,1000,"QA");
        Worker worker1 = new Worker("Peter","Miller",34,1000,"QA");
        Engineer engi = new Engineer("Mike","Hawk",28,1750,"Major Degree in engineering");
        Engineer engi1 = new Engineer("Walter","Hawk",27,1750,"Major Degree in engineering");
        HumanResourses HR = new HumanResourses("Alex","Vince",29,2500,"3");
        HumanResourses HR1 = new HumanResourses("Alyx","Vance",23,2100,"1");

        director.saySomething();
        director.rest();

        director1.doTask();
        director1.rest();
        System.out.println(director.equals(director1));
        System.out.println(director.hashCode());
        System.out.println(director1.hashCode());

        worker.doTask();
        worker.rest();

        worker1.saySomething();
        worker1.rest();
        System.out.println(worker.equals(worker1));
        System.out.println(worker.hashCode());
        System.out.println(worker1.hashCode());

        engi.doTask();
        engi1.doTask();

        engi1.saySomething();
        engi1.rest();
        engi.rest();
        System.out.println(engi.equals(engi1));
        System.out.println(engi.hashCode());
        System.out.println(engi1.hashCode());

        HR.doTask();
        HR1.doTask();

        HR1.saySomething();
        HR1.rest();
        HR.rest();
        System.out.println(HR.equals(HR1));
        System.out.println(HR.hashCode());
        System.out.println(HR1.hashCode());

        JavaDev dev = new JavaDev("Mike", 25); // Example of lombok usage from JavaDev.java
        JavaDev dev1 = new JavaDev("Max", 25);
        System.out.println(dev1.equals(dev));
    }
}
