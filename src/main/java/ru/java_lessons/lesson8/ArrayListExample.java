package ru.java_lessons.lesson8;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer[] numbers = {2,4,5,6,7};
        List<Integer> arrayList = new ArrayList<>(10); // работают только с ссылочными типами переменных

        arrayList.add(1);
        arrayList.add(100);
        int a1 = arrayList.get(0);
        int a2 = arrayList.get(1);
        arrayList.set(1,100);

        List<Integer> numbers1 = List.of(1,2,3); // постоянный лист, не подлежащий изменению (immutable)
        arrayList.addAll(numbers1);
        arrayList.addAll(List.of(numbers));
        Integer removedElement = arrayList.remove(5);
//        boolean isDeleted = arrayList.remove(Integer.valueOf(100));
        Collections.sort(arrayList);


        System.out.println(arrayList + "\n" + arrayList.size() + "\n" + removedElement);
        // ArrayList
        // Поиск элементов сложность O(1)
        // Удаление: с начала O(n),с конца 0(1)
        // Добавление: с начала 0(n),с конца 0(1)

        User user1 = new User("Bob", 33);
        User user2 = new User("Jane", 45);
        User user3 = new User("Jane", 45);

        List<User> users = new ArrayList<>(List.of(user1, user2));

        System.out.println(users.contains(user3) + "\n" +  user2.equals(user3));


    }
}
