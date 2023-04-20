package com.test.main;

import com.test.book.Book;
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("위대한 개츠비");
        System.out.println(book.getTitle());
    }
}
