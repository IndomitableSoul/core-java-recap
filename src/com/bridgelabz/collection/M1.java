package com.bridgelabz.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M1 {
    public static void main(String[] args) {
        HashMap<Integer,String  > hm = new HashMap<>();
        hm.put(1, "Rohan");
        hm.put(2, "Ridhi");
        System.out.println( hm.put(3, "Roshni"));
        System.out.println(hm);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.replace(2, "Rihan"));
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        //iterating entries of a map
        for(Map.Entry<Integer, String> entry : hm.entrySet()){
            System.out.println(entry);
        }

    }
}
//Map
//collection of Key:Value pairs
//java.util
//HashMap, LHM, TM
//Key cannot be duplicate in map
//Value can be
