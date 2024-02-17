package ru.java_lessons.lesson12;


import java.util.*;
import java.util.function.*;

public class LambdaMain {
    public static void main(String[] args) {
//        System.out.println(studentSortByCourseList(getStudentList()));
        //filter method
        List<Student> students = getStudentList();
//         students.forEach(System.out::println);  This is called "Method Reference", can be sometimes used instead of lambda

        //Predicate functional interface
        Predicate<Student> studentPredicate = student -> student.age > 22; // basically a condition for a filter or other method, lambda can be inserted right away instead of creating new predicate
        List<Student> sortedStudent = students.stream().filter(st -> Objects.nonNull(st.age)).filter(studentPredicate).toList();
        System.out.println(sortedStudent);

        //Function (also can be replaced with straight-up lambda)
        Function<Student, String> studentsNames = Student::name; //or student -> student.name;
        List<String> studentNames = students.stream().map(studentsNames).sorted().toList(); //.map basically works like ForEach
        System.out.println(studentNames);

        Comparator<Student> studentComparator = (st1,st2) -> CharSequence.compare(st1.name,st2.name); // also can be inserted right away instead of creating new comparator
        Function<Student, Student> addPrefix = st -> new Student("Mr." + st.name, st.age, st.course);
        List<Student> addPrefixToStudent = students.stream().sorted(studentComparator).map(addPrefix).toList();
        System.out.println(addPrefixToStudent);

        //Consumer
        Consumer<Student> print = System.out::println;
        students.forEach(print);

        //Supplier
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

//        long count = students.stream().count();
//        System.out.println(count);

        int ageSum = students.stream().filter(st -> Objects.nonNull(st.age)).peek(st -> System.out.println(st.age)).map(Student::age).reduce(0,Integer::sum);
        System.out.println(ageSum);

        System.out.println(students.stream().distinct().toList());


    }

    private static List<Student> studentSortByCourseList(List<Student> students){
        students.sort(Comparator.comparingInt(student -> student.course));
        return students;
    }

    public static List<Student> getStudentList(){
        Student student1 = new Student("Vaas", 24,4);
        Student student2 = new Student("Ivan", 26,5);
        Student student3 = new Student("Roman", 22,3);
        Student student4 = new Student("Peter", 21,2);
        Student student5 = new Student("Gregory", 20,1);
        Student student6 = new Student("Gregory", 20,1);
        Student student7 = new Student("Gregory", 20,1);
        Student student8 = new Student("Gregory", 20,1);

        return Arrays.asList(student1, student2, student3, student4 , student5, student6, student7, student8);
    }

    record Student(String name, Integer age, int course){
    }
    record Marks(int mark){

    }
}
