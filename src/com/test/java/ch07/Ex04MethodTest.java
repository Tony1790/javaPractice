package com.test.java.ch07;

import java.util.Scanner;
public class Ex04MethodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookTest book = new BookTest();
        BookTest book2 = new BookTest();
        BookTest[] arrBook = new BookTest[2];
        arrBook[0] = book;
        arrBook[1] = book2;

        for (int i = 0; i < arrBook.length; i++) {
            System.out.println("가격을 입력하세요.(10000 ~ 79999)");
            int price = scanner.nextInt();
            arrBook[i].setPrice(price);
            System.out.printf("가격은 %d원 입니다.", price);

            System.out.println("책의 저자를 입력하세요.");

        }


    }
}

class BookTest {
    int price;

    String[] author;

    void setPrice(int price) {
        this.price = price;
    }



}

/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요.
*/