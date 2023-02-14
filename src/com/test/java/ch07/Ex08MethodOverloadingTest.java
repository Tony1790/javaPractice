package com.test.java.ch07;

public class Ex08MethodOverloadingTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Avante");
        car.setManufactor("Hyundai");
        car.setMaxSpeed(250);
        System.out.println(car.getInfo());

        car.setInfo("Sorento", "KIA", 230);
        System.out.println(car.getInfo());

        System.out.println(car.setInfo());
        System.out.println(car.getInfo());

    }
}

class Car {
    String name;
    int maxSpeed;
    String manufactor;

    void setName(String name){
        this.name = name;
    }
    void setManufactor(String manufactor){
        this.manufactor = manufactor;
    }
    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    void setInfo(String name, String manufactor, int maxSpeed) {
        this.name = name;
        this.manufactor = manufactor;
        this.maxSpeed = maxSpeed;
    }

    String setInfo(){
        this.name = "";
        this.manufactor = "";
        this.maxSpeed = 0;

        return "정보가 초기화되었습니다.";
    }

    String getInfo(){
        return "자동차 이름 : " + name +"\n자동차 제조회사 : "+ manufactor +"\n자동차 최대속도 : " + maxSpeed + "km/h\n";
    }
}
