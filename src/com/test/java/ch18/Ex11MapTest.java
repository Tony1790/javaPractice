package com.test.java.ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex11MapTest {
    public static void main(String[] args) {
        Student2 s1 = new Student2("유재석");
        s1.addTest(new Test("3월 모의고사", 100));
        s1.addTest(new Test("6월 모의고사", 90));

        Student2 s2 = new Student2("조세호");
        s2.addTest(new Test("3월 모의고사", 80));
        s2.addTest(new Test("6월 모의고사", 70));

        Student2 s3 = new Student2("남창희");
        s3.addTest(new Test("6월 모의고사", 60));
        s3.addTest(new Test("9월 모의고사", 70));

        Student2 s4 = new Student2("홍진경");
        s4.addTest(new Test("3월 모의고사", 80));
        s4.addTest(new Test("6월 모의고사", 60));
        s4.addTest(new Test("9월 모의고사", 40));

        List<Student2> classRoom1 = new ArrayList<>();
        classRoom1.add(s1);
        classRoom1.add(s2);

        List<Student2> classRoom2 = new ArrayList<>();
        classRoom2.add(s3);
        classRoom2.add(s4);

        School school = new School();
        school.addClass("1반", classRoom1);
        school.addClass("2반", classRoom2);

        school.printClassAll();
    }
}

class School {
    Map<String, List<Student2>> classMap;
    public School() {
        classMap = new HashMap<>();
    }
    public void addClass(String className, List<Student2> classRoom) {
        classMap.put(className, classRoom);
    }

    public void printClassAll() {
        for (Entry<String, List<Student2>> entry: classMap.entrySet()) {
            for (Student2 student : entry.getValue()) {
                System.out.println(entry.getKey() + " " + student.getName());
                for (Test t : student.getTests()) {
                    System.out.println(t.getTestName() + ", " + t.getGrade() + "점");
                }
                System.out.println("---");
            }
        }
    }
}

class Student2 {
    private String name;
    private List<Test> tests;

    public Student2(String name) {
        this.name = name;
        tests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void addTest(Test test) {
        tests.add(test);
    }
}

class Test {
    private String testName;
    private int grade;

    public Test(String testName, int grade) {
        this.testName = testName;
        this.grade = grade;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


/*
문제 1.
반별 학생 목록을 저장하는 맵을 작성하세요.
학생들은 자신의 모의고사 점수들을 리스트로 갖습니다.
학생마다 치른 모의고사 횟수는 다를 수 있습니다.
모든 반의 학생과 각 학생이 치른 모의고사들의 점수를 출력하세요.
위의 예제와 같이 클래스를 사용하여 코딩하세요.
*/