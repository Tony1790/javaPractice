package com.test.java.ch13;

public class Ex02EqualsTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("해리포터", "알폰소 쿠아론", 123456789);
        Movie m2 = new Movie("해리포터", "알폰소 쿠아론", 123456789);
        System.out.println(m1.equals(m2));
    }
}

class Movie {
    private String title;
    private String director;
    private int sales;

    public Movie(String title, String director, int sales) {
        this.title = title;
        this.director = director;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "영화제목: " + title + ", 영화감독: " + director + ", 영화매출: " + sales;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Movie))
            return false;

        Movie movie = (Movie) obj;
        return title.equals(movie.title) && director.equals(movie.director) && sales == movie.sales;
    }
}



/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
equals 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 true 를 반환하도록 코딩하세요.
*/