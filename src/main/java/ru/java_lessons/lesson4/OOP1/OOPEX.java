package ru.java_lessons.lesson4.OOP1;

import javax.print.attribute.standard.JobKOctets;

public class OOPEX extends Object{ //Classes can be extended by other ones(including base java class - Object)
    // inheritance, encapsulation, polymorphism, abstraction
    // Object adds these methods - hashcode(),equals(),clone(), toString(), notify(), notifyAll(), wait(),getClass()
    public static void main(String[] args) {
        OOPEX oopex = new OOPEX();
        oopex.hashCode();

    }
}
