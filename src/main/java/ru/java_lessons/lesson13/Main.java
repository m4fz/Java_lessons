package ru.java_lessons.lesson13;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static ru.java_lessons.lesson13.Gender.MALE;
import static ru.java_lessons.lesson13.Gender.FEMALE;


public class Main {
    public static void main(String[] args) {
      Stream<List<Employee>> employeeStream = Stream.of(getEmployeeList());
      List<Employee> employeeList = getEmployeeList();

//        IntStream.of(1,3,5,10).map(x -> x * 10).filter(x -> x > 30).forEach(System.out::println);

        double sumSalary = employeeList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(sumSalary);

        Optional<Employee> employee = employeeList.stream().reduce((empl1, empl2) -> empl1.getSalary() > empl2.getSalary() ? empl2 : empl1);

        employee.ifPresent(System.out::println);
        Map<Gender, List<Employee>> genderEmployeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));

        genderEmployeeMap.entrySet().forEach(it -> System.out.println(it +"\n"));

        Optional<Integer> integerOptional = Optional.of(100);
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);
        Optional<Employee> employeeOptional = Optional.empty();
        Optional<Employee> notEmptyEmployee = Optional.of(Employee.of("Ivan", "Ivanov", 33,10000,MALE));
        notEmptyEmployee.ifPresent(empl -> System.out.println(empl.getFirstName()));
        employeeOptional.ifPresentOrElse(empl -> System.out.println(empl.getFirstName()), () -> System.out.println(" is empty"));

        Employee employee1 = employeeOptional.orElseGet(() -> Employee.of("Default","Default", 0 , 0.0 , MALE));
        System.out.println(employee1);

        try {
            employeeOptional.orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
        } catch (EmployeeNotFoundException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }

        record Gamer(String nickName, List<String> games){

        }
        Gamer gamer1 = new Gamer("g1",Arrays.asList("Quake 3", "CS2", "WarCraft 3"));
        Gamer gamer2 = new Gamer("g2",Arrays.asList("Quake 2", "CS", "WarCraft 4"));
        List<Gamer> gamers = Arrays.asList(gamer1, gamer2);

        List<String> games = gamers.stream().flatMap(gamer -> gamer.games.stream()).toList();
        System.out.println(games);


    }
    public static List<Employee> getEmployeeList(){
        return Arrays.asList(
                Employee.of("Ivan", "Ivanov", 33,10000,MALE),
                Employee.of("George", "Petrov", 42,20000, MALE),
                Employee.of("Oleg", "Koltsov", 35,35000, MALE),
                Employee.of("Mary", "Smirnova", 27,8000,FEMALE),
                Employee.of("Irina", "Sorokova", 23,6000,FEMALE),
                Employee.of("John", "Connor", 55,50000, MALE));
    }
}
