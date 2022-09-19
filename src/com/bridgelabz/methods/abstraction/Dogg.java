package com.bridgelabz.methods.abstraction;

public class Dogg implements Annimal{
    @Override
     public void sound() {
        System.out.println("Barks");
    }

    @Override
     public void run() {
        System.out.println("Runs fast");
    }

    public static void main(String[] args) {
        Dogg dogg = new Dogg();
        dogg.run();
        dogg.sound();

       // Annimal a = new Annimal(); we cannot create object of interface. To use an interface we create its sub class
        //and inherit using implements keyword
        //but we can create its reference variable

       Annimal a =new Dogg();
       a.run();
       a.sound();
    }
}
//pub>protected>default>private