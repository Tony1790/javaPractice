package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex05ThrowTest {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setVisit(true);

        while(guest.isVisit()) {
            guest = MachineService.form();
            MachineService.perchase(guest);
        }

    }
}

class MachineService {
    static Drink drink1 = new Drink("코카콜라", 1500);
    static Drink drink2 = new Drink("스프라이트", 1400);
    static Drink drink3 = new Drink("스타벅스", 2500);
    static Drink[] arr = {drink1, drink2, drink3};

    //게스트를 정의한다.
    public static Guest form(){
        Scanner scanner = new Scanner(System.in);
        Guest guest = new Guest();

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

    public static void perchase(Guest guest) {
        try {
            if(!(guest.getBalance() > 1400)) {
                throw new MoneyIsNotEnough("잔액이 부족합니다.");
            } else {
                guest.setVisit(true);
            }
        } catch (MoneyIsNotEnough e) {
            System.out.println(e.getMessage());
            System.out.println("잔액 부족");
            guest.setVisit(false);
        } catch (Exception e) {
            System.out.println("시스템 에러");
        }
    }
}

class Guest {
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

class MoneyIsNotEnough extends Exception {
    public MoneyIsNotEnough(String message) {
        super(message);
    }
}
/*
문제 1.
음료를 뽑을 수 있는 자판기 프로그램을 만들어 주세요.
제공되는 음료 외의 번호 입력 시 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
잔액이 부족할 경우 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
각각의 예외 발생에 대해 예외처리하는 코드를 작성해 주세요.
*/

