package ru.java_lessons.lesson11;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer>  myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);

//        myMap.remove("one");
//        System.out.println(myMap.containsValue(4));

        System.out.println(myMap); // Выдаёт в порядке бакетов от нулевого до последнего(в необходимости порядка, можно использовать linked hash map)

        Map<Integer, Car> cars = new HashMap<>();
        Car car1 = new Car("BMW", 2020,4);
        Car car2 = new Car("VW", 2019,5);
        Car car3 = new Car("Mercedes", 2018,7);
        Car car4 = new Car("Lada", 2015,1);
        Car car5 = new Car("Lada", 2015,1);
        Car.Engine engine1 = new Car.Engine(100); // static inner class
        Car.Wheels wheels1 =  new Car("BMW", 2020,4).new Wheels(5); // non static inner class

        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);
        cars.put(4, car4);
//        cars.put(5,car5);

        System.out.println(car4.hashCode());
        System.out.println(car5.hashCode());
        System.out.println(cars.containsValue(car5));


        Map<Car, Integer> treeCars = new TreeMap<>(new CarComparator()); //Ошибка из-за сложных ключей если нет компаратора(нужен либо отдельно созданный компаратор или имплементирование компэрэбл(или лямбда))
        treeCars.put(car1, 1);
        treeCars.put(car2, 2);
        treeCars.put(car3, 3);
        treeCars.put(car4, 4);
        treeCars.put(car5, 5);

        for (Map.Entry<Car, Integer> entry : treeCars.entrySet()){ // Удалять во время чтения можно только с многопоточной реализацией мэпа
            System.out.println(entry);
        }


        System.out.println("\n" + treeCars);

    }
}
