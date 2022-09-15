package com.bridgelabz.methods.nonStatic;

public class P1 {
    int x;
    int y; // non-static variables. instance variables, fields

    public P1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void m1(){
        System.out.println("From non static method m1");
    }

    public static void main(String[] args) {
        P1 p = new P1(10, 20);

        System.out.println(p.x);  //10
        System.out.println(p.y);  //20
        System.out.println(p.x+ p.y); //30
        //P1.m1();//wrong
        p.m1();
    }
}
//Non-static members can be accessed using object reference variable