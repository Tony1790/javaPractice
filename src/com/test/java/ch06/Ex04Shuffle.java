package com.test.java.ch06;

import java.util.Arrays;

public class Ex04Shuffle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            int n = (int)(Math.random()* arr.length);
            //n은 arr 1~10까지의 숫자에서 랜덤하게 가져온 숫자.
            int tmp = arr[i];
            //tmp는 배열 인덱스 0~9까지 차례대로 반복해서 지정.
            arr[i] = arr[n];
            //예를 들어, 가장 처음 arr[0]은 값이 1이었지만 이제 랜덤한 숫자로 지정된 arr[n]의 값으로 바뀜.
            arr[n] = tmp;
            //arr[n]의 값은 그 다음 숫자인 arr[1]로 변경되었음.
        }
        System.out.println(Arrays.toString(arr));
    }
}
