package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Emp implements Comparable<Emp> {
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Emp o) {
       return this.id - o.id;
    }

    @Override
    public String toString() {
        return "{"+id + " , " +name+"}";
    }

    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        Emp emp1 = new Emp(1, "Nikhil");
        Emp emp2 = new Emp(12, "Niharika");
        Emp emp3 = new Emp(31, "Ray");
        Emp emp4 = new Emp(4, "Rocky");

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        System.out.println(emps);
        Collections.sort(emps);
        System.out.println(emps);

    }
}
//compareTo()
//Comparable