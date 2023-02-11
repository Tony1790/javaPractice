package com.test.java.ch06;

import java.util.Scanner;

public class Ex06WhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 2;
        int j = 1;

        while(i <= 9){
            while(j <= 9){
                System.out.printf("%d * %d = %d%n", i, j, i*j);
                j++;
            }
            j = 1;
            i++;
        }
    }
}
/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다.
중첩 while문을 이용해 구구단을 출력하세요.
*/
