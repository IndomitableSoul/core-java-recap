package com.bridgelabz.collection;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(10);//Integer;

        arr.add("hello");//String
        arr.add(12.3);//Double
        System.out.println(arr);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);

    }
}

//Collections: Framework in java present in java.util
//Collection allows us to store any number of objects.
//There are 3 types of collection in java: List, Set, Queue
//Apart from Collection we also see Map
//List: ArrayList, LinkedList
//Wrapper Classes