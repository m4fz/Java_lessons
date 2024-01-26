package ru.java_lessons.lesson8.homework;

import javax.print.DocFlavor;
import java.util.*;

public class StudentArrayList {
    public static void main(String[] args) {
        Student student1 = new Student("John","Engineer",19);
        Student student2 = new Student("Frank","Computer Science",17);
        Student student3 = new Student("Bob","Mechanic",37);
        Student student4 = new Student("Kyle","Biologist",24);
        Student student5 = new Student("Frick","Engineer",21);
        Student student6 = new Student("Irene","Mechanic",67);

        List<String> studentNames = new ArrayList<>
                (List.of(student1.getName(), student2.getName(), student3.getName(), student4.getName(), student5.getName(), student6.getName()));
        List<String> studentFaculties = new ArrayList<>
                (List.of(student1.getFaculty(), student2.getFaculty(), student3.getFaculty(), student4.getFaculty(), student5.getFaculty(), student6.getFaculty()));
        List<Integer> studentAges = new ArrayList<>
                (List.of(student1.getAge(),student2.getAge(),student3.getAge(),student4.getAge(),student5.getAge(),student6.getAge()));

//        List<String> students = new ArrayList<>(6);
//        for (int i = 0; i < 6; i++) {
//            students.set(i,(studentNames.get(i) + "-" + studentFaculties.get(i) + "-" + studentAges.get(i)));
//        }
//        не получилось осуществить идею.

        String students = "";
        for (int i = 0; i < 6; i++) {
            students += studentNames.get(i) + "-" + studentFaculties.get(i)  + "-"  + studentAges.get(i)+ ", ";
        }

        System.out.println("\nBefore deletion: \n" + students);

        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).contains("Invalid name")) {
                studentNames.remove(i);
                studentFaculties.remove(i);
                studentAges.remove(i);

            }
        }

        students = "";
        for (int i = 0; i < studentNames.size(); i++) {
            students += studentNames.get(i) + "-" + studentFaculties.get(i)  + "-"  + studentAges.get(i)+ ", ";
        }

        System.out.println("\nAfter deletion: \n" + students);

        for (int i = 0; i < studentFaculties.size(); i++){
            if (!studentFaculties.get(i).equalsIgnoreCase("Computer Science")) {
                studentFaculties.set(i, "Computer Science");
            }
        }
        students = "";
        for (int i = 0; i < studentNames.size(); i++) {
            students += studentNames.get(i) + "-" + studentFaculties.get(i)  + "-"  + studentAges.get(i)+ ", ";
        }

        System.out.println("\nAfter converting faculty: \n" + students);

        Stack<String> studentStack = new Stack<>();

        System.out.println("\nStack print out:");
        for (int i = 0; i < studentNames.size(); i++) {
            studentStack.push(studentNames.get(i) + "-" + studentFaculties.get(i) + "-" + studentAges.get(i) + ", ");
            System.out.println(studentStack.peek());
        }

    }

}
