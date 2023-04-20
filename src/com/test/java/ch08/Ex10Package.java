package com.test.java.ch08;

import com.test.java.ch08.ex06.Book;
public class Ex10Package {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "엘컴퓨터학원";
        System.out.println(book.getTitle());
    }
}
