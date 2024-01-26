package ru.java_lessons.lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListExampleTest {

    @Test
    void main() {
        User user1 = new User(" ", 200);
        assertEquals(user1.getAge(),18);
        assertEquals(user1.getName(), "name");
    }
}