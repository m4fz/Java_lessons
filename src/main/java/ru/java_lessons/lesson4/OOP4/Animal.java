package ru.java_lessons.lesson4.OOP4;

public interface Animal {   //interface cannot have a constructor, can inherit another interface,
                            //must be redefined(through override) to complete a obligatory contract

    int a = 12; // inside of a interface, variables are always public static final

    // methods are always abstract
    void makeVoice(); //always public abstract

    int getLength(String str);

    default int sum(int a, int b){ // default methods are always public
        return a + b;
    }
}
