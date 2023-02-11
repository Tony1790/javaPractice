package com.test.java.ch06;

import java.util.Arrays;

public class Ex05BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {10,5,7,25,37,8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //맞게 한건지 헷갈립니다.
    }
}



/*
문제 1.
{10, 5, 7, 25, 37, 8} 배열을 버블정렬을 이용하여 내림차순으로 정렬하세요.
*/

