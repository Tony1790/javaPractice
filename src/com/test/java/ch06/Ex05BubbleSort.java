package com.test.java.ch06;

import java.util.Arrays;
public class Ex05BubbleSort {
    public static void main(String[] args) {
        int [] arr = {9,7,2,20,5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    //arr[i]가 arr[j]보다 클 때,
                    int tmp = arr[i];
                    //tmp = arr[i]로 대입한다.
                    arr[i] = arr[j];
                    //arr[i]를 arr[j]로 대입한다.
                    arr[j] = tmp;
                    //arr[j]를 tmp로 대입한다.

                    /*
                    예를 들어 arr[0] = 9, arr[1] = 7이니 조건문이 참이다.
                    그러므로 tmp는 9이고 arr[0] = 7이 되며 arr[1]은 9가 된다.
                    arr = {7,9,2,20,5}
                    그 다음 arr[1] = 9는 arr[2] = 2보다 크니 조건문이 참이다.
                    그러므로 tmp는 9이고 arr[1] = 2가 되며 arr[2]은 9가 된다.
                    arr = {7,2,9,20,5}
                     * */

                    //잘 이해가 안된다.. 저걸 무한으로 돌린다는건가?
                }
            }
            //이 for문은 배열 안의 숫자들을 작은 순부터 큰 순으로 재정렬하기위한 알고리즘이다.
        }
        System.out.println(Arrays.toString(arr));
    }
}
