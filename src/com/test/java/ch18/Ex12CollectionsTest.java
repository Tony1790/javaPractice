package com.test.java.ch18;

import java.util.*;

public class Ex12CollectionsTest {
    public static void main(String[] args) {
        System.out.println("문제 1");
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,8,3,6,5,4,7,2,9,10);
        System.out.println();

        System.out.println("바이너리서치로 검색");
        System.out.println(Collections.binarySearch(list, 5));
        System.out.println();

        Collections.sort(list);
        System.out.println("오름차순 출력");
        System.out.println(list);
        System.out.println();

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("내림차순 출력");
        System.out.println(list);
        System.out.println();

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < 5; i++) {
            list2.add((int)(Math.random() * 10));
        }
        System.out.println("리스트에 임의의 값 추가");
        System.out.println(list2);
        System.out.println();

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[][] arrArr1 = {{1,2,3},{4,5,6}};
        int[][] arrArr2 = {{1,2,3},{4,5,6}};
        int[][] arrArr3 = {{1,2,3},{4,5,8}};

        System.out.println("equals, deepEquals 비교");

        System.out.println(arr1.equals(arr2)); //false

        System.out.println(arrArr1.equals(arrArr2)); //false

        System.out.println(Arrays.equals(arr1, arr2)); //true

        System.out.println(Arrays.equals(arrArr1, arrArr2)); //false

        System.out.println(Arrays.deepEquals(arrArr1, arrArr2)); //true

        System.out.println(Arrays.deepEquals(arrArr1, arrArr3)); //false
    }
}


/*
문제 1.
addAll 을 이용해 리스트에 임의의 값들을 입력 후
binarySearch 를 이용해 검색하세요.
오름차순과 내림차순을 적용 후 출력하세요.
문제 2.
Arrays.asList를 이용해 리스트 생성 후 해당 리스트에 임의의 값을 추가하세요.
문제 3.
Arrays.equals 와 Arrays.deepEquals 를 사용하여 1차원 배열과 2차원 배열의 값을 비교하는 코드를 작성하세요.
*/



