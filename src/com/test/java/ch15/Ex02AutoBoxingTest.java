package com.test.java.ch15;

public class Ex02AutoBoxingTest {
    public static void main(String[] args) {
        Integer intgA = 3;
        Integer intgB = 7;
        int sum = intgA + intgB;
        System.out.println(sum);

        Integer intgC = Integer.valueOf(3);
        Integer intgD = Integer.valueOf(7);
        Integer intgE = Integer.valueOf(intgC.intValue() + intgD.intValue());
        System.out.println(intgE);
    }
}

/*
문제 1.
Integer intgA = 3;
Integer intgB = 7;
int sum = intgA + intgB;
위 내용을 오토박싱과 오토언박싱이 필요 없는 코드로 수정하세요.
*/


