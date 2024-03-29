package com.test.java.ch19;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04Stream {
    public static void main(String[] args) {
        System.out.println("< of >");
        Stream<String> stream = Stream.of("hi", "hello", "안녕하세요");
        stream.forEach(str -> System.out.println(str + ", "));
        System.out.println("\n");

        System.out.println("< generate >");
        Stream<Integer> lottoStream = Stream.generate(() -> (int)(Math.random()*45) + 1).limit(6);
        lottoStream.forEach(System.out::println);
        System.out.println();

        System.out.println("< iterate >");
        Stream
                .iterate(1, i -> i + 1)
                .limit(45)
                .forEach(i -> System.out.println(i + ","));
        System.out.println("\n");

        System.out.println(" <IntStream> ");
        IntStream intStream = new Random()
                .ints(1,45)
                .limit(6);
        intStream.forEach(System.out::println);
        System.out.println();

        List<EBook> ebooks = new ArrayList<>();
        ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
        ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
        ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
        ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
        ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
        ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
        //ebooks.add(new EBook("데이터베이스", 50000, EBook.Category.APP));

        System.out.println("< forEach >");
        ebooks
                .stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< filter >");
        // 파이프라인으로 시퀀스를 정하고 최종연산 시 필터링 및 출력됩니다.
        ebooks
                .stream()
                .filter(b -> b.getCategory().equals(EBook.Category.LANG)) // 중간연산 (intermediate operation)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< findFirst >");
        Optional<EBook> findFirstEB =
                ebooks
                        .stream()
                        .filter(eb -> eb.getTitle().startsWith("자바"))
                        .findFirst();
        System.out.println(findFirstEB);
        System.out.println(findFirstEB.get());
        System.out.println();

        System.out.println("< findAny >");
        Optional<EBook> findAnyEB =
                ebooks
                        .stream()
                        .filter(eb -> eb.getTitle().startsWith("자바"))
                        .findAny();
        System.out.println(findAnyEB.get());
        System.out.println();

        System.out.println("< anyMatch >");
        boolean isMatched =
                ebooks
                        .stream()
                        .anyMatch(eb -> eb.getTitle().startsWith("자바"));
        System.out.println(isMatched);
        System.out.println();

        System.out.println("< allMatch >");
        boolean isMatched2 =
                ebooks
                        .stream()
                        .allMatch(eb -> eb.getPrice() > 0);
        System.out.println(isMatched2);
        System.out.println();

        System.out.println("< noneMatch >");
        boolean isMatched3 =
                ebooks
                        .stream()
                        .noneMatch(eb -> eb.getTitle().startsWith("데"));
        System.out.println(isMatched3);
        System.out.println();

        System.out.println("< limit >");
        // 파이프라인으로 시퀀스를 정하고 최종연산 시 필터링 및 출력됩니다.
        ebooks
                .stream()
                .filter(b -> b.getCategory().equals(EBook.Category.LANG))
                .limit(2)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< distinct >");
        ebooks
                .stream()
                .filter(b -> b.getCategory().equals(EBook.Category.LANG))
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< map >");
        ebooks
                .stream()
                .filter(b -> b.getCategory().equals(EBook.Category.LANG))
                .map(EBook::getTitle)		// b -> b.getTitle()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< peek >");
        ebooks
                .stream()
                .filter(b -> b.getCategory().equals(EBook.Category.LANG))
                .peek(b -> System.out.println("peek1 -> " + b))
                .map(EBook::getTitle)		// b -> b.getTitle()
                .peek(s -> System.out.println("peek2 -> " + s))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("< flatMap >");
        Stream<String> stream2 = Stream.of("A:90", "B:80", "C:100");
        stream2
                .flatMap(s -> Arrays.asList(s.split(":")).stream())
                .forEach(System.out::println);
        System.out.println();
    }
}

class EBook implements Comparable<EBook> {
    public enum Category {
        LANG, APP
    }

    private String title;
    private int price;
    private Category category;

    public EBook(String title, int price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "[title=" + title + ", price=" + price + ", category=" + category + "]";
    }

    @Override
    public int compareTo(EBook b) {
        return title.compareTo(b.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, price, category);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EBook))
            return false;
        EBook eb = (EBook)o;
        return title.equals(eb.getTitle()) && (price == eb.price) && category.equals(eb.getCategory());
    }
}
















