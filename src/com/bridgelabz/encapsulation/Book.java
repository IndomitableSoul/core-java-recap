package com.bridgelabz.encapsulation;

public class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public int getBookId(){
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}

//Encapsulation:
//bind the properties and code which is going to manipulate those properties in a single unit known as class in java
//How you achieve it?
//1. properties should be private
//2. the methods that manipulate those properties should be public
//3. have one public constructor
//Purpose: to protect the data from outside access