package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AL {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(43);
        al.add(10);
        System.out.println(al);
        al.add(2, 23);
        System.out.println(al);
        System.out.println(al.add(12));
        System.out.println(al);
        int i = al.remove(2);
        System.out.println(i);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(12);
        al2.add(10);
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);



    }
}
