package com.test.java.ch18;

import java.util.*;

public class Ex14ComparatorTest {
    public static void main(String[] args) {
        PriorityQueue<Booka> pq = new PriorityQueue<>();
        Collections.addAll(
                pq,
                new Booka("Kill the MockingBird", 35000),
                new Booka("Harry potter", 50000),
                new Booka("Lord of Ring", 28000),
                new Booka("Me before You", 15000),
                new Booka("Temptation", 59000)
        );





        /*List<Booka> list = new ArrayList<>();
        list.addAll(pq);
        Collections.sort(list, new Comparator<Booka>() {
            @Override
            public int compare(Booka b1, Booka b2) {
                int result = Integer.valueOf(b1.getPrice()).compareTo(b2.getPrice()) * -1;
                if(result == 0)
                    result = b1.getTitle().compareTo(b2.getTitle());
                return result;
            }
        });
        System.out.println("높은 가격순 정렬");
        System.out.println(list);*/


    }
}

class Booka implements Comparable<Booka> {
    private String title;
    private int price;

    public Booka(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Booka book) {
        int result = Integer.valueOf(price).compareTo(book.getPrice()) * -1;
        if(result == 0)
            result = title.compareTo(book.getTitle()) * -1;
        return result;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 가격: " + price + "\n";
    }
}


/*
문제 1.
학생들을 Comparator 를 이용해 정렬하여 출력하세요.
번호 내림차순, 이름 오름차순으로 정렬하여 출력하세요.

문제 2.
번호 내림차순, 이름 내림차순으로 정렬하는 Comparator 를 이용해 출력하세요.
Comparator 는 익명클래스로 작성하세요.

문제 3.
PriorityQueue에 책들을 입력하세요.
Queue에서 책의 가격이 높은 책 부터 제거되도록 코딩하세요.
Comparable을 이용해 가격이 높은 책부터 제거되도록 작성하세요.
Comparator를 이용해 가격이 낮은 책부터 제거되도록 코딩하세요.
*/