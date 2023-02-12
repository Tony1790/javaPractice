package com.test.java.ch07;

import java.util.Scanner;

public class Ex03MethodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해주세요.");
        int firstNumber = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요.");
        int secondNumber = scanner.nextInt();

        Calculator cal = new Calculator();
        cal.setFirstNumber(firstNumber);
        cal.setSecondNumber(secondNumber);

        System.out.println("더한 값 : " + cal.add());
        System.out.println("뺀 값 : " + cal.subtract());
        System.out.println("곱한 값 : " + cal.multiply());
        System.out.println("나눈 값 : " + cal.divide());
    }
}

class Calculator {
    int firstNumber;
    int secondNumber;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    //this 문법 너무 헷갈립니다.

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    int add() {
        return firstNumber + secondNumber;
    }

    int subtract() {
        return firstNumber - secondNumber;
    }

    int multiply() {
        return firstNumber * secondNumber;
    }

    int divide() {
        return firstNumber / secondNumber;
    }
}

/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.
*/