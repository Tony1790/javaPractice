package com.test.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex02MultipleCatchBlockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {0,1,2};

        try {
            System.out.print("0~2 사이의 숫자를 입력하세요.");
            int i = scanner.nextInt();

            System.out.print("0 이외의 숫자를 입력하세요.");
            int num = scanner.nextInt();

            System.out.println(arr[i] / num);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("처음에 0,1,2의 숫자만 입력하세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력이 가능합니다.");
        } catch (ArithmeticException e) {
            System.out.println("산술예외가 발생했습니다.");
        } catch (Exception e) {
            System.out.println("예외 발생!");
            e.printStackTrace();
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}

/*
문제 1.
i에 0~2 이외의 숫자를 입력하여 예외를 발생 시키세요.

문제 2.
문자열을 입력하여 예외를 발생 시키세요.

문제 3.
num에 0을 입력하여 예외를 발생 시키세요.

문제 4.
예외가 발생되지 않도록 값을 입력한 뒤 실행하세요.
*/