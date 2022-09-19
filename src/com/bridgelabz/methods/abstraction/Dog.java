package com.bridgelabz.methods.abstraction;

public class Dog extends Animal{

    public void sound(){
        System.out.println("Barks");
    }

    public static void main(String[] args) {
        //Animal animal =  new Animal(); //Animal class is abstract so we cannot create its object
        Dog dog = new Dog();//Dog class has concrete methods sound() and sleep(); We can create its objects
        dog.sleeps();
        dog.sound();

        Animal a =new Dog();
        a.sound();
        a.sleeps();
    }

}

//abstract methods need to be overridden in the subclass
//Animal is abstract class. We cannot create its objects but we can create its reference variable