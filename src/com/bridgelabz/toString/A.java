package com.bridgelabz.toString;

public class A {
    int i=10;
    int j=20;

//    public String toString(){
//        return i+" "+j;
//    }
    public static void main(String[] args) {
        A ob = new A();//
        A ob2 = new A();
        //System.out.println(ob.toString());
        System.out.println(ob);//
        System.out.println(ob.hashCode());
        System.out.println(ob2.hashCode());



    }
}

//Object : inbuilt class present in java.lang. Every class is a subclass of this class.
//Object contains certain methods that get inherited by all the classes.
//whenever we try to print the object reference then internally toString() method is invoked