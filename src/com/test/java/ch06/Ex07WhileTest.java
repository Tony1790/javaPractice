package com.test.java.ch06;

import java.util.Scanner;

public class Ex07WhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coke = 500;
        int soda = 300;
        int fanta = 200;
        int balance = 1000;
        int code = 0;
        boolean isConnected = true;

        while(balance >= 200 && isConnected){
            System.out.println("what do you want to drink?\n(Coke(500) => 1, Soda(300) => 2, Fanta(200) => 3)\n(you have " + balance + ")\n\n[if you don't want anything, put -1]");
            code = scanner.nextInt();

            if(code == -1){
                System.out.println("Good bye");
                isConnected = false;
            } else if (code == 1) {
                System.out.println("Here is your Coke!");
                balance = balance - coke;
                System.out.println("you left " + balance);
            } else if (code == 2) {
                System.out.println("Here is your Soda!");
                balance = balance - soda;
                System.out.println("you left " + balance);
            } else if (code == 3) {
                System.out.println("Here is your Fanta!");
                balance = balance - fanta;
                System.out.println("you left " + balance);
            } else {
                System.out.println("Error! you put wrong code");
            }
        }
    }
}

/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.
*/