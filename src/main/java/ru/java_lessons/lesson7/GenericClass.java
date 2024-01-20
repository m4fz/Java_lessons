package ru.java_lessons.lesson7;

public class GenericClass <T, V, K>{
    private T var1;
    private V var2;
    private K var3;
    public GenericClass(T var1, V var2, K var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1(){
        return this.var1;
    }

    public V getVar2(){
        return this.var2;
    }
    public K getVar3(){
        return this.var3;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                ", var3=" + var3 +
                '}';
    }
}
