package com.test.java.ch06;

import java.util.Arrays;
public class Ex04ShuffleTest {
    public static void main(String[] args) {
        int[] arr = new int[45];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[6];

        for (int i = 0; i < 6; i++) {
            int n = (int)(Math.random() * arr.length);
            //1~45 숫자 랜덤생성.
            int tmp = arr[i];
            //배열 0번 인덱스부터 5번 인덱스까지 지정
            arr[i] = arr[n];
            //배열 0번 인덱스부터 5번 인덱스까지 1~45까지의 숫자 무작위로 대입
            arr[n] = tmp;
            //무작위 숫자가 배열 0번 인덱스부터 저장
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        //arr2없이 출력 어떻게 하는지?
    }
}

/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고
6개의 번호만 출력하는 코드를 작성하세요.
*/