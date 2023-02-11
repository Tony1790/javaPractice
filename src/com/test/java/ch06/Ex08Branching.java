package com.test.java.ch06;

import java.util.Scanner;
public class Ex08Branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;

        while (true) {
            System.out.println("출금할 금액을 입력하세요.");
            int money = scanner.nextInt();
            if(balance - money < 0){
                System.out.println("잔액이 초과되었습니다.");
                continue;
            } else if (balance - money == 0) {
                System.out.println("출금할 잔액이 없습니다.");
                balance -= money;
                break;
            }

            balance -= money;
            System.out.println(money + "원을 출금하였습니다.");
            System.out.println(balance + "원이 남았습니다.");
        }
        System.out.println("------------");
        System.out.println("잔액은 " + balance + "원입니다.");
    }
}
