package com.bridgelabz.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        System.out.println(hs.add(20));//does not allow duplicates
        System.out.println(hs);//
        hs.add(23);
        //wap to print all the numbers from a set
        for(int x: hs){
            if(x%2!=0)
            System.out.println(x);
        }

        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
//Implementation classes : HashSet, LinkedHashSet, TreeSet
//Properties of Set:
//Does have indexing
//Does not allow duplicates
//Does not maintain order of insertion
//HashSet allows  only single null
//TreeSet does not allow any null value
