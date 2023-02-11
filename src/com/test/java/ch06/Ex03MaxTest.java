package com.test.java.ch06;

public class Ex03MaxTest {
    public static void main(String[] args) {
        int[] arr = {90, 98, 94, 45, 87};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최댓값은 " + max + "\n최솟값은 " + min);
    }
}

/*
문제 1.
학생 5명의 점수를 저장하는 배열을 작성 한 뒤
최저점수와 최고점수를 찾아 출력하세요.
*/