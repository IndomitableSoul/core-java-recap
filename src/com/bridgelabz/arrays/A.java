package com.bridgelabz.arrays;

public class A {
    public static void main(String[] args) {
      int[] a = {1, 3, 4, 5, 6, 22, 33, 12, 54, 22};

//        System.out.println(a);//gives reference of array object
//        System.out.println(a.length);//gives size or length // 3
//        System.out.println(a[0]);//10
//        System.out.println(a[1]);//20
//        System.out.println(a[2]);//30
// to access each element of n Array
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("**************");

        //print the elements from the array that are even
        for(int i=0; i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }
        System.out.println(("**************"));
        //print the elements in reverse
        for(int i = a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }

        System.out.println("+++++++++++++++++++++++++");

        int[] b = new int[5];//creating an array of size 5
        b[0] = 12;
        b[3] = 11;

        System.out.println("_________________________");
        //create an array to store 15 numbers in it starting from 123

        int[] x = new int[15];
//        x[0] = 1;
//        x[1] = 2;
//        .
//        .
//        x[14]= 15;
        for(int index=0, ele = 123 ; index < x.length; index++, ele++){
            x[index] = ele;
        }
        for (int i=0; i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

//Array: group of elements having a finite size. In java array is an object. It gets created in heap memory.
//It's of fixed size. It's a continuous memory location
//int x = 10; int y=20; int z = 30;


//i: plays the role of index
//a[i]: gives the element at given index
//a.length-1 is last index

//{1, 22, 11, 13, 12, 23, 18}
//Print all even elements
//Print all odd elements
//Print all the elements which are divisible by 5
//Print all elements which are present at `even index
//--------------------------------------- odd ----


//How to check if an number is prime number, armstrong

//Create an array of size 15
//Store 15 consecutive numbers starting from 12
//------15-------------even-------------------
//---------------------odd--------------------