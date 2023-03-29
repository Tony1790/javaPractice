package com.test.java.ch21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex03ObjectStreamsTest {
    public static void main(String[] args) {
        try (
                ObjectOutputStream out =
                        new ObjectOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream(
                                                "com/test/java/ch21/parkinglot.txt")));
                ) {
            Car car1 = new Car("SONATA", 30000000, 1.15);
            Car car2 = new Car("CONA", 27000000, 1.05);
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.add(car1);
            parkingLot.add(car2);
            out.writeObject(parkingLot);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream in =
                        new ObjectInputStream(
                                new BufferedInputStream(
                                        new FileInputStream(
                                                "com/test/java/ch21/parkinglot.txt")));
                ) {
            ParkingLot parkingLot = (ParkingLot) in.readObject();
            System.out.println(parkingLot.getCars());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
    private double tax;

    public Car(String name, int price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + ", tax=" + tax + "]";
    }
}

class ParkingLot implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Car> cars = new ArrayList<>();
    public void add(Car car) {
        cars.add(car);
    }
    public void print() {
        System.out.println(cars);
    }
    public List<Car> getCars() {
        return cars;
    }
}

/*
문제 1.
두 대의 차를 주차장에 주차하는 코드를 작성하세요.
주차장 인스턴스를 파일에 쓴 뒤 다시 읽어 와 주차장의 상태를 출력하세요.
*/