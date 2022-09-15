package com.bridgelabz.methods;

public class MethodCalling {

    public static void m1(int x, int y){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("From main");
        m1(12, 34);
        MethodCalling.m1(10, 23);
    }
}
