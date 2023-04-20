package com.test.java.ch12;

import java.util.Scanner;

public class Ex09TryWithResourcesTest {
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("아무거나 입력해보세요.");
            String input = scanner.nextLine();
            System.out.println("입력한 것 : " + input);
        }
    }
}



/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요.
*/


