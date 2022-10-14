package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;

public class AL2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(43);
        al.add(10);
        System.out.println(al);
        al.removeIf(n-> n%2!=0);
        System.out.println(al);
        System.out.println(al.size());//
        System.out.println(al.contains(22));
        System.out.println(al.isEmpty());
        System.out.println(al.toArray()[2]);
    }
}
