/*
        Create a library management system which is capable of issuing books to the students
        Book should hava info like:
            1. Book Name
            2. Book Author
            3. Issued to
            4. Issued on
        user should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database

 */


package com.Tech.Advance.Java;

import java.util.ArrayList;

class Book{
    public String name,author,issued_to,issue_on;

}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addbook(Book book){
        System.out.println("The book has been added to the library : : ");
        this.books.add(book);
    }

    public void returnbook(Book b){
        System.out.println("The book has been returned : ");
        this.books.add(b);
    }
}

public class Ad_Practice_problem_set {
    public static void main(String[] args) {
//        System.out.println("hello akash : ");




    }
}
