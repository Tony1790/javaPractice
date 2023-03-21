package com.test.java.ch19;

import java.util.function.*;

public class Ex01FunctionalInterfaceTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (no1, no2) -> no1 > no2;
        System.out.println(bp.test(10, 5));
        System.out.println();

        BinaryOperator<Integer> bo = (x, y) -> x * x * y;
        System.out.println(bo.apply(5,2));
        System.out.println();

        IntConsumer ic = (x) -> {
            int square = x*x;
            System.out.println(x + "의 제곱은 " + square + "이다");
        };
        ic.accept(5);
        System.out.println();

        IntFunction<String> intF = (x) -> {
            if(x % 2 == 0) {
                return "짝수";
            } else {
                return "홀수";
            }
        };
        System.out.println(intF.apply(5));
        System.out.println();

        IntPredicate ip = (x) -> {
            if(x % 2 == 0)
                return true;
            else
                return false;
        };
        System.out.println(ip.test(1598235));
        System.out.println();

        IntUnaryOperator iuo = (x) -> -x;
        System.out.println(iuo.applyAsInt(5));
        System.out.println();

        IntToDoubleFunction itdf = (x) -> (double) x;
        double result = itdf.applyAsDouble(15);
        System.out.println(result);
        System.out.println();

        ToIntFunction<String> tif = (x) -> Integer.parseInt(x);
        int results = tif.applyAsInt("777");
        System.out.println(results + 223);
        System.out.println();

        ToIntBiFunction<Integer, Integer> tibf = (x, y) -> x * y;
        System.out.println(tibf.applyAsInt(80, 70));
    }
}


/*
문제 1.
BiPredicate
BinaryOperator
IntConsumer
IntFunction
IntPredicate
IntUnaryOperator
IntBinaryOperator
IntToDoubleFunction
ToIntFunction
ToIntBiFunction
위 함수형 인터페이스들을 이용해 람다식을 작성하고 출력하세요.
*/