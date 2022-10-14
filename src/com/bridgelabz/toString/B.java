package com.bridgelabz.toString;

public class B {
    int i;
    int j;
    B(int i, int j){
        this.i = i;
        this.j = j;
    }
    public static void main(String[] args) {
        B ob1 = new B(10,20);
        B ob2 = new B(10, 20);
        System.out.println(ob1.equals(ob2));//t
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
    }

    public boolean equals(B ob){
        return this.i == ob.i && this.j==ob.j;
    }

    public int hashCode(){
        return i+j;
    }
}

//Object -> equals()

//Rule: Whenever we override equals() method in a class, we must also override hashCode() such that if equals return true
// for two objects then hashCode() should return same integer value for both the objects
