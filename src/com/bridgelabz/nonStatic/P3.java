package com.bridgelabz.nonStatic;

public class P3 {
    int i;
    static int j = 23;
    static int k;
    public P3(int i) {
        this.i = i;
    }
    static void m1(){
        System.out.println(j);
        System.out.println(P3.j);
        System.out.println(k);
    }
    void m2(){
        System.out.println(this.i);
        System.out.println(j);
        System.out.println(P3.j);
    }

    public static void main(String[] args) {
        P3 ob = new P3(12);
        System.out.println(ob.i);
        System.out.println(P3.j);
        System.out.println(j);
        System.out.println(P3.k);
        System.out.println(k);
        ob.m2();
        P3.m1();
    }
}
