package com.test.java.ch06;

import java.util.Scanner;
public class Ex09DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';
        do {
            System.out.println("문자를 입력해주세요.");
            String str = scanner.nextLine();
            ch = str.charAt(0);
            if(ch >= '0' && ch <= '9')
                System.out.println("숫자입니다.");
            else if (ch >= 'A' && ch <= 'Z')
                System.out.println("알파벳 대문자입니다.");
            else if (ch >='a' && ch <= 'z')
                System.out.println("알파벳 소문자입니다.");
        } while ( ch != 'q');
        System.out.println("프로그램이 종료되었습니다.");
    }
}
