package com.test.java.ch07;

import java.util.Scanner;

public class Ex01BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("도서 관리 프로그램");

        String[] arrTitle = new String[10];
        String[] arrAuthor = new String[10];
        int[] arrPrice = new int[10];
        int bookCount = 0;
        boolean run = true;

        while(true){
            String title = "";
            String author = "";
            int price = 0;

            System.out.println("-------------");
            System.out.println("메뉴를 선택하세요. 1:책등록, 2:책목록, 0:종료");
            System.out.print(">>");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("책을 등록하세요.");

                    System.out.print("제목:");
                    title = scanner.nextLine();

                    System.out.println("저자:");
                    author = scanner.nextLine();

                    System.out.println("가격:");
                    price = scanner.nextInt();
                    System.out.printf("제목: %s, 저자: %s, 가격:%d%n%n", title, author, price);

                    arrTitle[bookCount] = title;
                    arrAuthor[bookCount] = author;
                    arrPrice[bookCount]= price;
                    bookCount++;
                    break;
                case 2:
                    System.out.println("책의 목록을 확인합니다.");
                    /* (1) */
                    break;
                case 0:
                    run = false;
                    break;
            }
            if (!run)
                break;
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
