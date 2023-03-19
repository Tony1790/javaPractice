package com.test.java.ch18;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex10MapTest {
    public static void main(String[] args) {
        System.out.println("1반");
        Map<String, Integer> classA = new HashMap<>();
        classA.put("전재준", 65);
        classA.put("박연진", 83);
        classA.put("문동은", 100);
        classA.put("하도영", 95);
        classA.put("최혜정", 75);
        classA.put("이사라", 55);
        classA.put("손명오", 35);
        for (Map.Entry<String, Integer> e : classA.entrySet()) {
            System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
        }
        System.out.println();

        System.out.println("2반");
        Map<String, Integer> classB = new HashMap<>();
        classB.put("진양철", 100);
        classB.put("진도준", 80);
        classB.put("진영기", 30);
        classB.put("진동기", 40);
        classB.put("진성준", 55);
        classB.put("모현민", 60);
        classB.put("오세현", 70);
        for (Iterator<String> it = classB.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            System.out.println("이름: " + key + "\t점수: " + classB.get(key));
        }
        System.out.println();

        System.out.println("< 1반 + 2반 통합 >");
        Map<String, Integer> student = new HashMap<>();
        student.putAll(classA);
        student.putAll(classB);
        for (Map.Entry<String, Integer> e : student.entrySet()) {
            System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
        }
        System.out.println();

        System.out.println("점수가 90점 이상인 학생들을 맵에서 삭제 후 출력");
        for(Iterator<Map.Entry<String, Integer>> it = student.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Integer> e = it.next();
            if(e.getValue() >= 90) {
                it.remove();
            }
        }
        for (Map.Entry<String, Integer> e : student.entrySet()) {
            System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
        }
        System.out.println();

        System.out.println("55점인 학생 모두 맵에서 삭제");
        for(Iterator<Map.Entry<String, Integer>> it = student.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Integer> e = it.next();
            if(e.getValue() == 55) {
                System.out.println("점수가 55점인 학생: " + e.getKey());
                it.remove();
            }
        }
        System.out.println();

        System.out.println("100점인 학생이 존재하는 지 출력");
        for(Iterator<Map.Entry<String, Integer>> it = student.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Integer> e = it.next();
            if(e.getValue() == 100) {
                System.out.println("점수가 100점인 학생 : " + e.getKey());
            }
        }
        System.out.println();

        System.out.println("최종 맵");
        for (Map.Entry<String, Integer> e : student.entrySet()) {
            System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
        }
    }
}


/*
문제 1.
1반 학생들의 이름, 점수가 저장된 맵과 2반 학생들의 이름, 점수가 저장된 맵을 만드세요.
두 반의 모든 학생들을 중복 없이 출력하세요.
문제 2.
점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요.
문제 3.
55점인 학생 모두 맵에서 삭제하세요.
문제 4.
100점인 학생이 존재하는 지 출력하세요.
*/

