package com.test.java.ch14;

import java.util.Arrays;

public class Ex03StringUtilsTest {
    public static void main(String[] args) {
        //문제 1
        String s1 = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        System.out.println(s1.substring(18));

        //문제 2
        String[] strArr = s1.split(" +");
        System.out.println(Arrays.toString(strArr));
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[strArr.length - i -1];
        }
        System.out.println(Arrays.toString(strArr2));

        //문제 3
        s1 = "동해물";
        String s2 = "백두산";
        System.out.println(s1.compareTo(s2));
    }
}


/*
문제 1.
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세
위 문장에서 substring 을 사용하여 "하느님이" 부터 끝까지 출력하세요.

문제 2.
위 문장을 split을 사용하여 공백을 기준으로 배열로 만든 뒤
배열의 맨 뒤에서 앞으로 요소들을 출력하세요.

문제 3.
동해물
백두산
두 문자열 중 더 큰 문자열을 출력하세요.
힌트) compareTo를 사용하세요.
*/