package com.test.java.ch06;

import java.util.Scanner;
public class Ex06While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("생산할 tv의 수량을 입력하세요.");
        int tvCount = scanner.nextInt();

        int i = 0;
        while (i < tvCount) {
            System.out.println("TV 1대를 생산하였습니다.");
            i++;
        }

    }
}
