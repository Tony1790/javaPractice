package com.test.java.ch09;

public class Ex04PolymorphismTest {

    public static void main(String[] args) {
        Productz p = new Productz();
        Productz p2 = p;
        System.out.println(p.equalsProduct(p2));

        Bookz b1 = new Bookz();
        b1.setTitle("자바 자료구조");
        b1.setAuthor("엘컴퓨터학원");
        b1.setPrice(20000);

        Bookz b2 = new Bookz();
        b2.setTitle("C");
        b2.setAuthor("엘컴퓨터학원");
        b2.setPrice(10000);

        Bookz b3 = new Bookz();
        b3.setTitle("파이썬");
        b3.setAuthor("엘코딩랩");
        b3.setPrice(50000);

        System.out.println(b1.equalsProduct(b2));
        System.out.println(b1.equalsProduct(b3));

        Bookz expensiveBook = (Bookz) b1.compareProduct(b2);
        System.out.println("Title of the more expensive book: " + expensiveBook.getTitle());

        expensiveBook = (Bookz) b1.compareProduct(b3);
        System.out.println("Title of the more expensive book: " + expensiveBook.getTitle());

    }

}

class Productz {
    public boolean equalsProduct(Productz p) {
        return this == p;
    }

    public Productz compareProduct(Productz p){
        return null;
    }


}

class Bookz extends Productz{
    private String title;
    private String author;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equalsProduct(Productz p) {
        if (!(p instanceof Bookz))
            return false;
        Bookz book = (Bookz)p;
        boolean result = title.equals(book.title) && author.equals(book.author);

        return result;
    }

    @Override
    public Productz compareProduct(Productz p) {
        if (!(p instanceof Bookz))
            return null;
        Bookz book = (Bookz) p;
        if (this.getPrice() > book.getPrice()) {
            return this;
        } else {
            return book;
        }
    }

}

/*
문제 1.
Productz 클래스에 두 인스턴스간의 크기를 비교하는 메소드인 compareProduct 메소드를 추가하세요.
Bookz 클래스에 compareProduct 메소드를 오버라이딩 후 가격이 높은 책의 인스턴스를 반환하도록 코딩하세요.
반환된 인스턴스의 title을 출력하세요.
*/