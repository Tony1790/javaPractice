package com.test.java.ch08;

import com.test.java.ch08.ex06.Book;

// 접근 제한자

public class Ex06AccessModifiers {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("자바기본문법");
        //b1.title = "자바기본문법";
        System.out.println(b1.getTitle());

        //b1.author = "엘컴퓨터학원";
        b1.setAuthor("엘컴퓨터학원");
        //System.out.println(b1.author);
        System.out.println(b1.getAuthor());

        b1.setPrice(50000);
        //b1.setDollarPrice(50000);
        System.out.println(b1.getPrice());
        System.out.println(b1.getDollarPrice());

        //b1.edition = 3;

        //b1.tax = 1.1f;
        //b1.setTax(1.1f);

        EBook5 eb1 = new EBook5();
        eb1.setPrice(30000);
        //eb1.tax = 1.1f;
        eb1.setTax(1.1f);
        System.out.println("세금 적용된 가격: " + eb1.getPrice() * eb1.getTax());
    }
}

class EBook5 extends Book {
    String fontColor;

	/*
	void setEdition(int edition) {
		this.edition = edition;
	}
	*/

    @Override
    protected void setTax(float tax) {
        this.tax = tax+0.1f;
    }

    @Override
    protected float getTax() {
        return tax;
    }
}
