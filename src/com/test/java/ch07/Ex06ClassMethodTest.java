package com.test.java.ch07;

public class Ex06ClassMethodTest {

    public static void main(String[] args) {
        Book5 b1 = new Book5();
        b1.bookNo = Book5.generateBookNo();
        System.out.println(b1.bookNo);
        System.out.println(b1.getDollar());

        System.out.println();

        Book5 b2 = new Book5();
        b2.bookNo = Book5.generateBookNo();
        System.out.println(b2.bookNo);
        System.out.println(b1.getDollar());
    }

}

class Book5 {
    String title;
    static int bookNo;

    static int generateBookNo() {
        return (int)(Math.random()*9000)+1000;
    }

	static int genBookNo() {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}

    static float getDollar() {
        float bookNoUSD = bookNo / 1000f;
        return bookNoUSD;
    }
}

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.
문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다.
*/

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.
문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다.
*/