package com.test.java.ch06;

public class Ex08BranchingTest {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(true){
            i++;
            if (i%2 == 0){
                sum += i;
                if(sum > 50){
                    break;
                }
            } else if (i%2 != 0) {
                continue;
            }
        }
        System.out.printf("i의 값은 %d", i);
    }
}

/*
문제 1.
i=1, sum=0 일때
i는 1씩 증가되고 i가 짝수일 경우 sum에 누적됩니다.
sum의 값이 50을 초과할 때의 i값을 출력하세요.
while문, continue, break문을 사용해야 합니다.
*/