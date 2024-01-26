package ru.java_lessons.lesson8;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Last in first out(LIFO)

        Stack<String> stack = new Stack<>();

        stack.push("hello");
        stack.push("hi");
        stack.push("mahaj");
        //stack.pop забирает последний элемент с удалением
        //stack.peek показывает последний элемент без удаления

        System.out.println(stack.pop() + " " + stack);

        // Stack
        // Поиск элементов сложность O(n)
        // Удаление: с начала O(n),с конца 0(1)
        // Добавление: с начала 0(n),с конца 0(1)
    }
}
