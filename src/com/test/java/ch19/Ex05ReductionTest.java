package com.test.java.ch19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05ReductionTest {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Avante", 10000000));
        cars.add(new Car("Cona", 15000000));
        cars.add(new Car("Sorento", 20000000));
        cars.add(new Car("GV80", 80000000));
        cars.add(new Car("A6", 70000000));
        cars.add(new Car("X7", 90000000));
        cars.add(new Car("SantaFe", 35000000));
        cars.add(new Car("Sonata", 30000000));
        cars.add(new Car("Carnival", 36000000));
        cars.add(new Car("CLS", 55000000));

        System.out.println("문제 1");
        double avgPrice =
                cars
                        .stream()
                        .mapToInt(Car::getPrice)
                        .average()
                        .getAsDouble();
        System.out.printf("%,.0f원%n", avgPrice);
        System.out.println();


        System.out.println("문제 2");
        long maxPrice =
                cars
                        .stream()
                        .mapToInt(Car::getPrice)
                        .max()
                        .getAsInt();
        System.out.println(maxPrice);
        System.out.println();

        System.out.println("문제 3");
        int sumPriceWithTax =
                cars
                        .stream()
                        .mapToInt(Car::getPrice)
                        .reduce(0, (a,b) -> a + (int)(b * 1.1f));
        System.out.println(sumPriceWithTax);
        System.out.println();
    }
}

/*
문제 1.
자동차 금액의 평균가를 출력하세요.

문제 2.
가장 높은 자동차의 금액을 출력하세요.

문제 3.
세금 10% 부가된 자동차 가격 총액을 출력하세요.
힌트) reduce를 사용하세요.

문제 4.
두 개의 리스트를 생성 후 collect를 사용하여 병합하세요.
병합된 리스트를 출력하세요.
*/