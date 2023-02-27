package com.test.java.ch12;

import java.util.Scanner;
public class Ex05ThrowTest {
    public static void main(String[] args) {
        Guest guest = null;

        guest = MachineService.form();
    }
}

class MachineService {
    static Drink drink1 = new Drink("코카콜라", 1500);
    static Drink drink2 = new Drink("스프라이트", 1400);
    static Drink drink3 = new Drink("스타벅스", 2500);
    static Drink[] arr = {drink1, drink2, drink3};

    public static Guest form() {
        Scanner scanner = new Scanner(System.in);
        Guest guest = new Guest();

        System.out.println("- 반갑습니다. -");
        System.out.println(" 금액을 넣어주세요 ");
        guest.setBalance(scanner.nextInt());
        System.out.println(" 무엇을 드시겠습니까? ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("1번: " + arr[i].getName() + ", " + arr[1].getPrice() + "원");
        }
        guest.setPick(scanner.nextInt());

        return guest;
    }
}


class Guest {
    private int balance;
    private boolean visit;
    private int pick;

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }
}

class Drink {
    private String name;
    private int price;

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

    Drink(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }
}

/*
문제 1.
음료를 뽑을 수 있는 자판기 프로그램을 만들어 주세요.
제공되는 음료 외의 번호 입력 시 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
잔액이 부족할 경우 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
각각의 예외 발생에 대해 예외처리하는 코드를 작성해 주세요.
*/

