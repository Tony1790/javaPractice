package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex08ChainedExceptionTest {
    public static void main(String[] args) {
        Guest3 guest = new Guest3();
        guest.setVisit(true);

        while(guest.isVisit()) {
            try {
                guest = MachineService3.form();
                MachineService3.validateInspect(guest);
            } catch (MachineException e) {
                System.out.println(e.getMessage());
                System.out.println("문의사항은 000-1234-5678 로 연락주세요.\n");
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요!");
                break;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("해당 번호는 음료가 없습니다.");
            }
        }

    }
}

class MachineService3 {
    static Drinkx drink1 = new Drinkx("코카콜라", 1500);
    static Drinkx drink2 = new Drinkx("스프라이트", 1400);
    static Drinkx drink3 = new Drinkx("스타벅스", 2500);
    static Drinkx[] arr = {drink1, drink2, drink3};

    //게스트를 정의한다.
    public static Guest3 form(){
        Scanner scanner = new Scanner(System.in);
        Guest3 guest = new Guest3();

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

    public static void validateInspect(Guest3 guest) throws MachineException {
        try {
            if (!(guest.getBalance() > 1400)) {
                throw new MoneyIsNotEnough3("잔액이 부족합니다.");
            } else {
                success(guest);
                guest.setVisit(true);
            }
        } catch (MoneyIsNotEnough3 e) {
            System.out.println("잔액을 더 넣어주세요");
            throw new MachineException("자판기 예외가 발생하였습니다.", e);
        }
    }

    public static void success(Guest3 guest) throws MoneyIsNotEnough3 {
        guest.setBalance(guest.getBalance() - arr[guest.getPick()-1].getPrice());

        if(!(guest.getBalance() < 0)) {
            System.out.println("감사합니다! 고객님이 주문하신 " + arr[guest.getPick() - 1].getName() + "입니다.");
            System.out.println("잔액 " + guest.getBalance() + "원을 가져가세요.\n");
        } else {
            throw new MoneyIsNotEnough3("잔액이 부족합니다.");
        }
    }
}

class Guest3 {
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

class Drinkx {
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

    Drinkx(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }
}

class MachineException extends Exception {
    public MachineException(String message, Exception e) {
        super(message, e);
    }
}

class MoneyIsNotEnough3 extends Exception {
    public MoneyIsNotEnough3(String message) {
        super(message);
    }
}