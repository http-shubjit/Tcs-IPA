// Create a class Book with below attributes

// id - int

// pages - int

// title - String

// author - String

// price - double

// The above attributes should be private, write getters and setters and parameterized constructor as required.

// Create a class Solution with main method
// --------------------------------------------
// Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

// findBookWithMaximumPrice :
// =============================
// Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and 
// returns the Book object having the maximum Price if found else return null if not found.

// searchBookByTitle :
// =============================
// Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as 
// input and returns the Book object having the mentioned Title if found else return null if not found.

// These methods should be called from the main method.

// write code to perform the following tasks.

// 1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
//  object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print 
//  "No Book found with mentioned attribute."

// 2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object 
// details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

// The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and 
// printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
// result.

// All String comparison needs to be in case sensitive.

// Input:

// 1
// 845
// Bengali
// Arijit
// 525.50

// 2
// 456
// English
// Raju
// 412.30

// 3
// 1022
// History
// Kaka
// 525.50

// 4
// 125
// geography
// MN
// 524

// English

// Output:

// 1 Bengali
// 3 History
// 2
// 456

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book[] books = new Book[4];
        for (int i = 0; i < books.length; i++) {
            int id = sc.nextInt();
            int pages = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            books[i] = new Book(id, pages, title, author, price);
        }
        double price = sc.nextDouble();
        String title = sc.nextLine();
        Book[] re1 = findBookWithMaximumPrice(books, price);
        Book re2 = searchBookByTitle(books, title);
    }

    private static Book searchBookByTitle(Book[] books, String title) {
       for (int i = 0; i < books.length; i++) {
        if(books[i].title.equalsIgnoreCase(title))
            return books[i];
       }
       return null;
    }

    private static Book[] findBookWithMaximumPrice(Book[] books, double price) {
        Book[] details = new Book[0];
        double max = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].price >= max) {
                max = books[i].price;
            }
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].price == max) {
                details = Arrays.copyOf(details, details.length + 1);
                details[details.length - 1] = books[i];
            }
        }
        if (details.length > 0) {
            return details;
        } else {
            return null;
        }

    }
}


class Book {
    // id - int

    // pages - int

    // title - String

    // author - String

    // price - double
     int bookid;
     int pages;
     String title;
     String author;
     double price;
    
    public Book(int bookid, int pages, String title, String author, double price) {
        this.bookid = bookid;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;  
    }
}