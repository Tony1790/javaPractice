package com.test.java.ch16;

import java.util.Calendar;

public class Ex01CalendarTest {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(2000, 12, 1);
        end.set(2020,05,06);

        long diffMilli = end.getTimeInMillis() - start.getTimeInMillis();
        System.out.println(diffMilli);

        long day = diffMilli / (24*60*60*1000);
        System.out.println(day);
        long year = day / 365L;
        System.out.println(year);

        System.out.print(day / 365 + "년 ");
        System.out.println(day % 365 + "일");
    }
}

/*
문제 1.
2000년 12월 1일
2020년 5월 6일
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요.
*/