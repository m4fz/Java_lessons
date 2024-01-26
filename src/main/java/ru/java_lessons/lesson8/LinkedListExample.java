package ru.java_lessons.lesson8;

import java.beans.PropertyEditorManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Вася");
        list.add("Соня");
        list.add("Генадий");
//        list.remove("Вася");

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//           list.set(i, "Привет " + list.get(i));
//        }
//        System.out.println(list);

//        int i = 0;
//        while (i < list.size()){
//            if(list.get(i).equals("Вася")) list.remove(i);
//            i++;
//        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            if(iterator.next().equals("Вася")) iterator.remove();
        }



        System.out.println(list);
        System.out.println(list.get(0) + list.contains("Вася"));

        // LinkedList
        // Поиск элементов сложность 0(n)
        // Удаление: с начала O(1),с конца 0(1)
        // Добавление: с начала 0(1),с конца 0(1)
        //
    }
}
