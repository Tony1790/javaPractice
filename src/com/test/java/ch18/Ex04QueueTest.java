package com.test.java.ch18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex04QueueTest {
    public static void main(String[] args) {
        Notice notice = new Notice();
        while(notice.getNum() != 4) {
            notice.entrance();
            switch (notice.getNum()) {
                case 1:
                    notice.registerNotice();
                    break;
                case 2:
                    notice.listNotice();
                    break;
                case 3:
                    notice.deleteNotice();
                    break;
                case 4:
                    notice.setNum(4);
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

class Notice {
    private Queue<String> notices;
    private int num;

    public Notice() {
        this.notices = new LinkedList<>();
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int entrance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 것을 고르세요.");
        System.out.println("1. 공지사항 등록");
        System.out.println("2. 공지사항 목록 보기");
        System.out.println("3. 가장 오래된 공지사항 삭제");
        System.out.println("4. 나가기");
        num = scanner.nextInt();
        return num;
    }

    public int getNum() {
        return num;
    }

    public void registerNotice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---공지사항 등록---");
        System.out.println("새로운 공지사항을 입력하세요.");
        String str = scanner.nextLine();
        notices.offer(str);
        System.out.println("공지가 등록되었습니다.");
    }

    public void listNotice() {
        System.out.println("---공지사항 목록---");
        for (String notice : notices) {
            System.out.println(notice);
        }
    }

    public void deleteNotice() {
        System.out.println("---공지사항 삭제---");
        System.out.println("---가장 오래된 공지사항을 삭제합니다---");
        notices.poll();
        for (String notice : notices) {
            System.out.println(notice);
        }
    }
}


enum Function {
    REGISTER,
    LIST,
    DELETE,
    EXIT;
}

/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/
