package com.test.java.ch19;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex08OptionalTest {
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
        Car car1 = new Car("Trax", 20520000);
        //car1 = null;
        Optional<Car> opt = Optional.ofNullable(car1);
        if(opt.isPresent())
            System.out.println(car1.toString());
        else
            System.out.println("미입력차량");

        System.out.println("문제 2");
        Optional carPrice =
                Optional
                        .ofNullable(car1)
                        .map(Car::getPrice);
        if(!(carPrice.isPresent()))
            System.out.println(1);
        else System.out.println(carPrice.get());

        //flatMap을 이용해서 cars의 가격들을 전부 출력하는 방법??

    }
}


/*
문제 1.
입력 받은 자동차 정보를 이용해 인스턴스를 생성하세요.
인스턴스의 toString을 이용해 자동차의 정보를 출력하세요.
정보가 미입력 될 경우 참조변수에 null이 저장되어야 합니다.
옵셔널을 사용해 미입력된 자동차일 경우 '미입력차량'을 출력하세요.

문제 2.
옵셔널과 맵을 사용해 자동차의 금액을 출력하되 자동차의 금액이 없을 경우 1이 출력되도록 코딩하세요.
*/