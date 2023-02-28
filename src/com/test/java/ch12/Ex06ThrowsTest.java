package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex06ThrowsTest {
    public static void main(String[] args) throws MoneyIsNotEnough1 {
        Guest1 guest = new Guest1();
        guest.setVisit(true);

        while(guest.isVisit()) {
            guest = MachineService1.form();
            MachineService1.perchase1(guest);
        }

    }
}


class MachineService1 {
    static Drinkz drink1 = new Drinkz("코카콜라", 1500);
    static Drinkz drink2 = new Drinkz("스프라이트", 1400);
    static Drinkz drink3 = new Drinkz("스타벅스", 2500);
    static Drinkz[] arr = {drink1, drink2, drink3};

    //게스트를 정의한다.
    public static Guest1 form(){
        Scanner scanner = new Scanner(System.in);
        Guest1 guest = new Guest1();

        try {
            System.out.println("- 반갑습니다 고객님 -");
            System.out.println(" 금액을 투입하세요 ");
            guest.setBalance(scanner.nextInt());
            System.out.println(" 무엇을 드시겠습니까? ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i+1 + "번: " + arr[i].getName() + ", " + arr[i].getPrice() + "원");
            }
            guest.setPick(scanner.nextInt());
            guest.setBalance(guest.getBalance() - arr[guest.getPick()-1].getPrice());
            System.out.println("잔액은 " + guest.getBalance() + "원 입니다.");
            System.out.println(arr[guest.getPick()-1].getName());

        } catch(InputMismatchException e) {
            System.out.println("잘못된 타입입니다.");
            guest.setVisit(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("숫자를 잘못 입력하셨습니다.");
            guest.setVisit(false);
        } catch (Exception e) {
            System.out.println("시스템 에러");
            guest.setVisit(false);
        }
        return guest;
    }

    public static void perchase1(Guest1 guest) throws MoneyIsNotEnough1 {
            if(!(guest.getBalance() > 1400)) {
                throw new MoneyIsNotEnough1("잔액이 부족합니다.");
            } else {
                guest.setVisit(true);
            }
    }
}

class Guest1 {
    private int balance;
    //일단 킵. 추후 변경가능
    private int pick;
    private boolean visit;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }
}

class Drinkz {
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

    Drinkz(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }
}

class MoneyIsNotEnough1 extends Exception {
    public MoneyIsNotEnough1(String message) {
        super(message);
    }
}