package com.bridgelabz.nonStatic;

public class Book {
    String bookName;
    int noOfPages;
    public Book(String bookName, int noOfPages){
//        bookName = x; // bookName = "The Choice"
//        noOfPages = y;//noOfPAges = 324
          this.bookName = bookName; //this.bookName = "The Choice"
          this.noOfPages = noOfPages;//this.noOfPAge = 324

    }

    public static void main(String[] args) {
        Book book = new Book("The Choice", 324);

    }
}

//Constructor:
//its name is same as class whose object is being created
//its used for object creation

//Class: blueprint of object; it's a block of code where we define properties and behaviors of an object
//Object: instance of class that gets created in heap area
//new + Constructor
//this ? ? ? ?
//

