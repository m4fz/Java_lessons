package ru.java_lessons.lesson4.modifiers;

public class AccessModifier {
    public static void main(String[] args) {
        // public, private, protected, static, native, final

        Mod1 mod1 = new Mod1();
        //mod1.a; public
        //mod1.b; private and can be accessed only from it's class(mod1.java)
        //mod1.c; package-private
        //mod1.d; protected
    }
}
