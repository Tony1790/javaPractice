package com.test.java.ch07;

public class Ex04Method {
    public static void main(String[] args) {
        Book3 book = new Book3();
        int bookPrice = book.getPrice();
        System.out.println("세금 포함된 책의 가격: " + bookPrice);

        book.price = 50000;
        bookPrice = book.getPrice();
        System.out.println("세금 포함된 책의 가격: " + bookPrice);
        System.out.println();

        book.price = 30000;
        book.setPrice(35000);
        //this.price는 book.price 그대로 30000으로 나오지만, price는 setPrice의 args인 int price인 35000으로 나오는 것??
        System.out.println();

        book.setTitle("자바");
        System.out.println("책이름: " + book.title);

        book.setTitle("자바문법");
        System.out.println("책이름: " + book.title);
    }
}

class Book3 {
    int price;
    String title;

    int getPrice() {
        if (price <= 0)
            return 0;
        float tax = 1.1f;
        price = (int)(price * tax);

        return price;
    }

    void setPrice(int price) {
        System.out.println("price -> " + price);
        System.out.println("this.price -> " + this.price);

        this.price = price;
        System.out.println("this.price = price 적용 후 this.price -> " + this.price);
    }

    void setTitle(String title) {
        String[] filter = {
                "자바",
                "C",
                "Python"
        };

        for (int i = 0; i < filter.length; i++) {
            if (title.equals(filter[i])) {
                System.out.println("사용할 수 없는 책 이름입니다.");
                return;
            }
        }
        this.title = title;
    }
}