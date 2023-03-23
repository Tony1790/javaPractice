package com.test.java.ch19;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04StreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("가", "나", "다");
        stream.forEach(str -> System.out.print(str+", "));
        System.out.println();

        IntStream intStream = new Random()
                .ints(1, 100)
                .limit(10);
        intStream.forEach(System.out::println);
        System.out.println();

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Avante", 100));
        cars.add(new Car("Cona", 150));
        cars.add(new Car("Sorento", 200));
        cars.add(new Car("GV80", 800));
        cars.add(new Car("A6", 700));
        cars.add(new Car("X7", 900));
        cars.add(new Car("SantaFe", 350));
        cars.add(new Car("Sonata", 300));
        cars.add(new Car("Carnival", 360));
        cars.add(new Car("Carnival", 550));

        cars
                .stream()
                .filter(car -> car.getPrice() > 500)
                .forEach(System.out::println);
        System.out.println();

        cars
                .stream()
                .map(Car::getName)
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        cars
                .stream()
                .map(Car::getPrice)
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        cars
                .stream()
                .map(car -> car.getName())
                .flatMap(name -> Arrays.stream(name.split("")))
                .sorted()
                .forEach(System.out::println);

        Optional<Car> searchedCar = cars.stream()
                .filter(car -> car.getName().equals("Cona"))
                .findFirst();
        if(searchedCar.isPresent())
            System.out.println("검색결과: " + searchedCar.get());
        else
            System.out.println("찾을 수 없습니다.");
    }
}

class Car implements Comparable<Car> {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "이름: '" + name + '\'' +
                ", 가격: " + price;
    }
    @Override
    public int compareTo(Car car) {
        int result = Integer.valueOf(price).compareTo(car.getPrice());
        if (result == 0)
            result = name.compareTo(car.getName());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Car))
            return false;
        Car car = (Car)o;
        return name.equals(car.getName()) && (price == car.getPrice()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}


/*
문제 1.
스트림에 '가', '나', '다' 를 추가하는 코드를 작성하세요.
문제 2.
스트림을 사용하여 1~100 사이의 숫자 중 난수 10개를 출력하세요.
문제 3.
자동차 인스턴스 5개를 가진 배열을 만들고 스트림으로 변환하세요.
500원 보다 비싼 차량들을 출력하세요.
문제 4.
자동차 이름을 중복 제거 후 출력하세요.
문제 5.
자동차 인스턴스로 이뤄진 스트림을 자동차 금액들로만 이뤈진 스트림으로 변환 후 3개만 출력하세요.
문제 6.
스트림에 저장된 자동차명의 모든 글자를 나누어 한 글자씩 출력하되 오름차순으로 정렬하여 출력하세요.
힌트) flatMap, sorted 를 사용하세요.
문제 7.
스트림에서 특정 차량이름을 검색하여 출력하세요.
*/