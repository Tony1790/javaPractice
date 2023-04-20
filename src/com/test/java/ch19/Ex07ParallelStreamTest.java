package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Ex07ParallelStreamTest {
    public static void main(String[] args) {
        List<EBook2> ebooks = new ArrayList<>();
        ebooks.add(new EBook2("자바 기본문법", 50000, EBook2.Category.LANG));
        ebooks.add(new EBook2("자바 알고리즘", 30000, EBook2.Category.APP));
        ebooks.add(new EBook2("파이썬 기본문법", 35000, EBook2.Category.LANG));
        ebooks.add(new EBook2("파이썬 기본문법", 33000, EBook2.Category.LANG));
        ebooks.add(new EBook2("리눅스", 40000, EBook2.Category.APP));

        System.out.println("문제 1");
        ebooks
                .parallelStream()
                .sorted(Comparator.comparingInt(EBook2::getPrice).reversed())
                .forEachOrdered(System.out::println);
    }
}


/*
문제 1.
모든 책들의 정보를 책가격 기준 내림차순 정렬하여 출력하세요.
패러렐 스트림을 이용해야 합니다.
힌트) sorted와 Comparator를 사용하세요.
*/