package com.test.java.ch16;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex03LocalDateTest {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2000,12,1);
        LocalDate date2 = LocalDate.of(2020,5,6);

        Period p2 = Period.between(date1, date2);
        System.out.println(p2.getYears() + "년 " + p2.getMonths() + "개월 " + p2.getDays() + "일");
        System.out.println();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Scanner s = new Scanner(System.in);
        System.out.print("yyyy년MM월dd일 패턴으로 날짜를 입력해 주세요: ");
        String inputDate = s.nextLine();

        LocalDate date3 = LocalDate.parse(inputDate, df);
        System.out.println(date3);
        LocalDateTime datetime = date3.atStartOfDay();
        //System.out.println(datetime.plusMonths(1));
        datetime = datetime.plusMonths(1);
        System.out.println(df2.format(datetime));


    }
}

/*
문제 1.
2000년 12월 1일
2020년 5월 6일
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요.
문제 2.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd HH:mm:ss 패턴으로 출력하세요.
*/


