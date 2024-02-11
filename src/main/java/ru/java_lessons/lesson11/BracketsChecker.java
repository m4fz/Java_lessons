package ru.java_lessons.lesson11;

import java.util.LinkedList;
import java.util.List;

public class BracketsChecker {
    public static void main(String[] args) {
        // {[()]} = true
        // {{}[}] = false

    }

    public static boolean validBrackets(String str){
        if (str == null || str.isBlank() || str.isEmpty()) throw new EmptyStringException("Empty string");
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == '{' || chr == '(' || chr == '['){
                stack.push(chr);
            } else if (chr == '}' || chr == ')' || chr == ']') {
                if (!stack.isEmpty()){
                    char stackChr = stack.pop();
                    if ((chr == '}' && stackChr != '{') || (chr ==')' && stackChr != '(') || (chr ==']' && stackChr != '[')){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
