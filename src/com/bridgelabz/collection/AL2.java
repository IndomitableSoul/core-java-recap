package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(43);
        al.add(10);
        System.out.println(al);
        //sorting
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);

    }
}
//Collections is a utility class which contains certain methods that are used to perform some actions like sorting, shuffling
//of collection
