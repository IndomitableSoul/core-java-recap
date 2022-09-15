package com.bridgelabz.methods.nonStatic;

public class P2 {
    int x;

    static int y;

    public P2(int x) {
        this.x = x;
    }

    public void m1(){
        System.out.println(this);// P2@123
        System.out.println(this.x);//12
    }

    public static void main(String[] args) {
        P2 ob  = new P2(12);
        System.out.println(ob);//P2@123
        System.out.println(ob.x);//12

        System.out.println(P2.y);//0
        ob.m1();
    }
}
