package com.test.java.ch13;

import java.util.Objects;

public class Ex03HashCodeTest {
    public static void main(String[] args) {
        Movie2 m1 = new Movie2("Harry Potter", "Alponso Couaron");
        Movie2 m2 = new Movie2("Harry Potter", "Alponso Couaron");
        Movie2 m3 = new Movie2("Harry Potter", "David Yates");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
        System.out.println();

        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));
        System.out.println(System.identityHashCode(m3));
        System.out.println();
    }
}

class Movie2 {
    private String title;
    private String director;


    public Movie2(String title, String director) {
        this.title = title;
        this.director = director;

    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director);
    }
}

/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
hashCode 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 같은 해시코드를 반환하도록 코딩하세요.
*/