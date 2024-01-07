package ru.java_lessons.lesson4.OOP4;

public class BritishBreed  extends Cat implements Animal{ // uses Cat.java(abst.class) and Animal.java(interface)

    //overriding Animal method
    @Override
    public void makeVoice() {
    }
    //also overriding Animal method
    @Override
    public int getLength(String str) {
        return 0;
    }

    //but this one is overriding a Cat.java(abst.class) which is also necessary
    @Override
    void voice() {

    }
}
