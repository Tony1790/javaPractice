package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07ReThrowTest {
    public static void main(String[] args) {
        Guest2 guest = new Guest2();
        guest.setVisit(true);

        while(guest.isVisit()) {
            try {
                guest = MachineService2.form();
                MachineService2.validateInspect(guest);
            } catch (MoneyIsNotEnough2 e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요!");
                break;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("해당 번호는 음료가 없습니다.");
            }
        }

    }
}

class MachineService2 {
    static Drinky drink1 = new Drinky("코카콜라", 1500);
    static Drinky drink2 = new Drinky("스프라이트", 1400);
    static Drinky drink3 = new Drinky("스타벅스", 2500);
    static Drinky[] arr = {drink1, drink2, drink3};

    //게스트를 정의한다.
    public static Guest2 form(){
        Scanner scanner = new Scanner(System.in);
        Guest2 guest = new Guest2();

        System.out.println("- 반갑습니다 고객님 -");
        System.out.println(" 금액을 투입하세요 ");
        guest.setBalance(scanner.nextInt());
        System.out.println(" 무엇을 드시겠습니까? ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + "번: " + arr[i].getName() + ", " + arr[i].getPrice() + "원");
        }
        guest.setPick(scanner.nextInt());
        //guest.setBalance(guest.getBalance() - arr[guest.getPick()-1].getPrice());

        return guest;
    }

    public static void validateInspect(Guest2 guest) throws MoneyIsNotEnough2 {
        try {
            if (!(guest.getBalance() > 1400)) {
                throw new MoneyIsNotEnough2("잔액이 부족합니다.");
            } else {
                success(guest);
                guest.setVisit(true);
            }
        } catch (MoneyIsNotEnough2 e) {
            System.out.println("잔액을 더 넣어주세요");
            throw e;
        }
    }

    public static void success(Guest2 guest) throws MoneyIsNotEnough2 {
        guest.setBalance(guest.getBalance() - arr[guest.getPick()-1].getPrice());

        if(!(guest.getBalance() < 0)) {
            System.out.println("감사합니다! 고객님이 주문하신 " + arr[guest.getPick() - 1].getName() + "입니다.");
            System.out.println("잔액 " + guest.getBalance() + "원을 가져가세요.");
        } else {
            throw new MoneyIsNotEnough2("잔액이 부족합니다.");
        }
    }
}

class Guest2 {
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

class Drinky {
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

    Drinky(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }
}

class MoneyIsNotEnough2 extends Exception {
    public MoneyIsNotEnough2(String message) {
        super(message);
    }
}

