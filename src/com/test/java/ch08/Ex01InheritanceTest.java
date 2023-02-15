package com.test.java.ch08;

import java.util.Arrays;

public class Ex01InheritanceTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Lord of Ring";
        m1.director = "Peter Jackson";
        m1.runningTime = 220;
        m1.ticketPrice = 8182;
        System.out.println("영화 티켓값은 " + m1.getTicketPrice() + "원 입니다.");

        System.out.println();

        CommercialMovie m2 = new CommercialMovie();
        m2.title = "타이타닉";
        m2.boxOffice = (long)(2207986545L * 1200);
        m2.ticketPrice = 10000;
        m2.getAudienceNumber(m2.ticketPrice, m2.boxOffice);

        IndependentMovie m3 = new IndependentMovie();
        m3.fundingSource = "한국문화진흥원";
        m3.title = "거인";
        String[] prizes = {"부산국제영화제", "들꽃영화상", "청룡영화상", "한국영화평론가협회상"};
        m3.setAwards(prizes);
        IndependentMovie.printInfo(m3);
    }
}

class Movie {
    String title;
    String director;
    int runningTime;
    int ticketPrice;

    int getTicketPrice() {
        ticketPrice = (int)(ticketPrice * 1.1);
        return ticketPrice;
    }

}

class CommercialMovie extends Movie {
    String production;
    int cost;
    long boxOffice;

    void getAudienceNumber(int ticketPrice,long boxOffice){
        long AudienceNumber = (long)(boxOffice / ticketPrice);
        System.out.println("관객 수는 약 " + AudienceNumber + "명 입니다.\n");
    }
}

class IndependentMovie extends Movie {
    String[] filmFestivalAwards;
    String fundingSource;

    void setAwards(String... str){
        filmFestivalAwards = new String[str.length];
        for (int i = 0; i < filmFestivalAwards.length; i++) {
            filmFestivalAwards[i] = str[i];
        }
    }


    static void printInfo(IndependentMovie movie){
        System.out.printf("%s으로부터 지원받은 독립영화 [%s]의 영화제 수상 목록입니다.%n%s%n",
                movie.fundingSource, movie.title, Arrays.toString(movie.filmFestivalAwards));
    }
}
/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요.
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.
*/