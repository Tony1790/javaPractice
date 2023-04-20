package com.test.java.ch10;

public class Ex03LocalClassTest {
    public static void main(String[] args) {
        EBookA eb = new EBookA();
        EBookA eb1 = new EBookA();
        EBookA eb2 = new EBookA();
        eb.setAuthor("JKR");
        eb1.setAuthor("jkr");
        eb2.setAuthor("123JK");
        System.out.println(eb.getAuthor());
        EBookA.isValidAuthor(eb.getAuthor());
        EBookA.isValidAuthor(eb1.getAuthor());
        EBookA.isValidAuthor(eb2.getAuthor());
    }
}

class EBookA {
    private String title;
    private String author;
    private int price;
    public final static float tax = 1.1f;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        if (!EBook3.validatePrice(price))
            return;
        this.price=price;
    }

    public static boolean validatePrice(int price) {
        float dollar = 1100f;

        class Price {
            int taxPrice;

            Price(int price) {
                taxPrice = (int)(price * EBook3.tax);
                //dollor = 1200f; //error
            }

            int getTaxPrice() {
                return taxPrice;
            }

            float getDollarPrice() {
                return taxPrice / dollar;
            }
        }

        Price p = new Price(price);
        int taxPrice = p.getTaxPrice();
        System.out.println(taxPrice);

        float dollarPrice = p.getDollarPrice();
        System.out.println(dollarPrice);

        if(!(taxPrice >= 0 && taxPrice <= 50000))
            return false;
        else if(!(dollarPrice >= 0 && dollarPrice <= 50))
            return false;

        return true;
    }


    public static boolean isValidAuthor(String author) {
        class Author {
            boolean validate(String author) {
                return author.matches("[A-Z ]+");
            }
        }
        Author a = new Author();
        if (!(a.validate(author)) == true){
            System.out.println(a.validate(author));
            return false;
    }
        else {
            System.out.println(a.validate(author));
            return true;
        }
    }

    /*public boolean isValidAuthor() {
        class ValidateAuthor{
            public boolean validate(String author) {
                return author.matches("[A-Z ]+");
            }
        }
        ValidateAuthor validateAuthor = new ValidateAuthor();
        return validateAuthor.validate(this.author);
    }*/

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}



/*
문제 1.
로컬 클래스를 사용하여 저자 이름 유효성 검사 메소드를 코딩하세요.
저자 이름은 영문 대문자, 공백만 가능합니다.
*/