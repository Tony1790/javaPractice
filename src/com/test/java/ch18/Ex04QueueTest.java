package com.test.java.ch18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex04QueueTest {
    public static void main(String[] args) {
        Notice notice = new Notice();

        notice.performNotice(notice.entrance(), "하하하");

    }
}

class Notice {
    private Queue<String> notices;

    public Notice() {
        this.notices = new LinkedList<>();
    }

    public int entrance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 것을 고르세요.");
        System.out.println("1. 공지사항 등록");
        System.out.println("2. 공지사항 목록 보기");
        System.out.println("3. 가장 오래된 공지사항 삭제");
        System.out.println("4. 나가기");
        int num = scanner.nextInt() - 1;
        return num;
    }


    public void performNotice(int num, String notice) {
        switch(num) {
            case 0:
                registerNotice(notice);
                break;
            case 1:

            default:
                System.out.println("유효성 없음");
        }
    }

    public void registerNotice(String notice) {
        notices.add(notice);
        System.out.println("공지가 등록되었습니다.");
        System.out.println(notice);
    }

}


enum Function {REGISTER, LIST, DELETE,EXIT;}

/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/
