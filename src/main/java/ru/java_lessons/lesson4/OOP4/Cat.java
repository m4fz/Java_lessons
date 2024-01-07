package ru.java_lessons.lesson4.OOP4;

public abstract class Cat { //cannot make new instance form abstract class, doesn't have any default method, must be redefined
    //can have a constructor, does not have to redefine interface if implemented but will have to redefine them in another class which is extending to this one
    private String name;
    abstract void voice(); // must be redefined

    void run(){ // isn't necessary to redefine but can be used
        System.out.println("run");
    }


}
