package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Accessing elements of arraylist
//1. using get(index number)
//2. Iterator
public class AL3 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(43);
        al.add(10);
        //using get()
//        System.out.println(al.get(1));
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            if(i%2==0)
            System.out.println(al.get(i));
        }

        //Using Iterator
        Iterator<Integer> x = al.iterator();//[, , , ]
        while(x.hasNext()){
            System.out.println(x.next());//10, 22, 43,10
        }

        //foreach
        for ( int a:  al) {
           if(a%2==0){
               System.out.println(a);
           }

        }
    }
}
