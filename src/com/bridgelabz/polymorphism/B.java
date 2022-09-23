package com.bridgelabz.polymorphism;

public class B extends A{

    public void message(){
        System.out.println("Namaste");
    }

    public static void main(String[] args) {
        A ob1 = new A();
        ob1.message();//Hello

        System.out.println("_____________");

        B ob = new B();
        ob.message();//Namaste

        A ob2 = new B();
        ob2.message();

        A[] objects = {new A(), new B(), new B(), new A() };//int [] i = {10, 20, 30}   x=10; y=20; z=30;
        for(int i = 0; i<objects.length; i++){
            objects[i].message();
        }

    }
}

//Parent class members are inherited in child class
