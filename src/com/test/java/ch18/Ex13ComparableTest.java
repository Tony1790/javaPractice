package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13ComparableTest {
    public static void main(String[] args) {
        List<StudentA> students = new ArrayList<>();
        Collections.addAll(
                students,
                new StudentA(1, "Antony"),
                new StudentA(2, "Bread"),
                new StudentA(2, "Chelsea"),
                new StudentA(3, "Dwight"),
                new StudentA(4, "Eric"),
                new StudentA(6, "Fuka"),
                new StudentA(5, "George")
                );
        System.out.println("정렬전 ");
        System.out.println(students);
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        
        Collections.sort(students);
        System.out.println("정렬 후");
        System.out.println(students);
    }
}

class StudentA implements Comparable<StudentA> {
    private int no;
    private String name;

    public StudentA(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentA student) {
        int result = Integer.valueOf(this.no).compareTo(student.getNo());
        if(result == 0)
            result = name.compareTo(student.getName()) * -1;
        return result;

    }

    @Override
    public String toString(){
        return "번호: " + no + ", 이름: " + name;
    }
}

/*
문제 1.
번호와 이름을 가진 학생 클래스를 만드세요.
학생의 번호를 오름차순으로 정렬하여 출력하세요.
번호가 같을 경우 이름을 내림차순으로 정렬하여 출력하세요.
*/