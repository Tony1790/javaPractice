package com.test.java.ch07;

import java.util.Scanner;

public class Ex07FinalVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book6 b1 = new Book6();
        b1.title = "파이썬 기초문법";
        b1.author = "엘컴퓨터학원";
        b1.price = 20000;
        b1.setPrice(b1.price);


        Book6 b2 = new Book6();
        b2.title = "리눅스 명령어 모음집";
        b2.author = "엘코딩연구소";
        b2.price = 30000;
        b2.setPrice(b2.price);

        System.out.printf("제목: %s%n저자: %s%n가격: %d%n서점: %s%n%n", b1.title, b1.author,b1.price, Book6.BOOKSTORE_NAME);
        System.out.printf("제목: %s%n저자: %s%n가격: %d%n서점: %s%n%n", b2.title, b2.author,b2.price, Book6.BOOKSTORE_NAME);

        // Book6.BOOKSTORE_NAME = "엘서점";	// 에러
    }

}

class Book6 {
    final static String BOOKSTORE_NAME = "엘컴퓨터서점";
    String title;
    String author;
    int price;

    final static float TAX_RATE = 1.1f;

    void setPrice(int price){
        price = (int)(price * TAX_RATE);
        this.price = price;
    }
}

/*
문제 1.
책의 세율을 final로 설정한뒤 세율이 적용된 책의 가격을 출력하는 코드를 작성하세요.
*/
