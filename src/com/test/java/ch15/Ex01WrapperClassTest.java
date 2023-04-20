package com.test.java.ch15;

public class Ex01WrapperClassTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        Integer intgA = new Integer(a);
        Integer intgB = new Integer(b);

        //문제1
        System.out.println(intgA.intValue());
        System.out.println(intgB.intValue());

        //문제2
        System.out.println(Integer.sum(intgA, intgB));

        //문제3
        switch (intgA.compareTo(intgB)) {
            case 1:
                System.out.println("intgA ["+ intgA +"] 가 더 큽니다.");
            case 0:
                System.out.println("같은 값 입니다.");
            case -1:
                System.out.println("intgB ["+ intgB +"] 가 더 큽니다.");
        }

        //문제4
        System.out.println(Integer.max(intgA, intgB));
        System.out.println(Integer.min(intgA, intgB));

    }
}


/*
문제 1.
int a = 3;
int b = 7;
Integer intgA;
Integer intgB;
a와 b의 값을 갖는 intgA, intgB를 코딩하세요.

문제 2.
intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.

문제 3.
intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.

문제 4.
intgA 와 intgB의 최소값과 최대값을 구하세요.
힌트) max, min을 사용하세요.
*/