package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex03CollectionTest {
    public static void main(String[] args) {
        Set set = new TreeSet();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) +1;
            set.add(num);
        }
        System.out.println(set);
    }
}




/*
문제 1.
실행 결과와 구글링을 통해 각 컬렉션의 특징을 정리하세요.

문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.

문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요.
*/



