package com.test.java.ch16;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02DateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

        Scanner scanner = new Scanner(System.in);
        Date inputDate = null;

        System.out.print("yyyy년MM월dd일 패턴으로 날짜를 입력해 주세요: ");
        String s = scanner.nextLine();

        try {
            inputDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf2.format(inputDate));

        Calendar future = Calendar.getInstance();
        future.setTime(inputDate);
        future.add(Calendar.MONTH, 1);
        Date inputDate2 = future.getTime();
        System.out.println(sdf2.format(inputDate2));
    }
}

/*
문제1.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd 패턴으로 출력하세요.
*/