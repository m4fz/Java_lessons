package ru.java_lessons.lesson11;

import org.junit.jupiter.api.Test;

import java.text.BreakIterator;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {
    final String validStr = "{[]([]){{}}}";
    final String notValidStr = "{}]()";
    final String emptyStr = "";


    @Test
    void main() {
        assertTrue(BracketsChecker.validBrackets(validStr));
        assertFalse(BracketsChecker.validBrackets(notValidStr));

    }
}