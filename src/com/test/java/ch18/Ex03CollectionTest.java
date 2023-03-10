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
        List<String> innerList1 = new ArrayList<>();
        List<String> innerList2 = new ArrayList<>();
        List<List> outerList = new ArrayList<>();

        innerList1.add("아메리카노");
        innerList1.add("헤이즐넛 아메리카노");
        innerList1.add("더치 아메리카노");
        innerList1.add("어른커피");
        innerList1.add("카페라떼");
        innerList1.add("돌체라떼");
        innerList1.add("바닐라 라떼");
        innerList1.add("헤이즐넛 라떼");
        innerList1.add("카푸치노");
        innerList1.add("카라멜 마끼아또");
        innerList1.add("카페모카");
        innerList1.add("쿠키 프라페");
        innerList1.add("폭탄 프라페");
        innerList1.add("민트 프라페");
        innerList1.add("녹차 프라페");
        innerList1.add("모카 프라페");

        innerList2.add("딸기스노우크림프라페");
        innerList2.add("아임파인");
        innerList2.add("얼음수박");
        innerList2.add("치즈 컵빙수");
        innerList2.add("옛날 컵빙수");
        innerList2.add("플레인 요거트");
        innerList2.add("딸기 요거트");
        innerList2.add("블루베리 요거트");
        innerList2.add("쿠키 프라페");
        innerList2.add("폭탄 프라페");
        innerList2.add("민트 프라페");
        innerList2.add("녹차 프라페");
        innerList2.add("모카 프라페");
        innerList2.add("어른커피");
        innerList2.add("카페라떼");
        innerList2.add("돌체라떼");
        innerList2.add("바닐라 라떼");
        innerList2.add("헤이즐넛 라떼");

        outerList.add(innerList1);
        outerList.add(innerList2);

        for (List list : outerList) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("---------------");
        }
        Set set = new LinkedHashSet();
        System.out.println(set);

        for(List list : outerList) {
            for (int i = 0; i < list.size(); i++) {
                set.add(list.get(i));
            }
        }
        System.out.println(set);

    }
}




/*
문제 1.
실행 결과와 구글링을 통해 각 컬렉션의 특징을 정리하세요.

    컬렉션 프레임워크에는 3가지 인터페이스가 있다.
List, Set, Map이다. 각각의 인터페이스는 다른 기능을 구현한다.

    List에는 ArrayList와 LinkedList가 있다.
ArrayList는 Object배열을 이용해서 데이터를 순차적으로 저장한다.
그렇기때문에 데이터의 저장순서가 유지되고 요소에 대한 접근성이 뛰어나다는 장점이 있다.
그러나 ArrayList의 경우 데이터의 추가, 삭제에 있어서 작업시간이 오래 걸린다는 단점이 있다.
그 이유는 ArrayList는 데이터를 연속적으로 가지고있기때문에 추가, 삭제를 할 경우 데이터 전체를 덮어써야하기때문이다.

    LinkedList의 경우에는 데이터가 불연속적으로 저장되며 각각의 요소에는 데이터와 다음 주소를 가리키는 주소값이 있다.
그렇기때문에 특정 인덱스의 데이터를 수정, 삭제할 때 데이터를 통째로 덮어쓸 필요없이 참조값과 데이터를 바로 수정할 수 있다.
그러나 특정 인덱스의 요소에 대한 접근성이 좋지않다.
그렇기때문에 임의의 인덱스 요소에 대한 빠른 엑세스와 별다른 수정이 필요하지 않은 경우에는 ArrayList를,
자주 수정해야하는 경우 LinkedList를 사용하는 것이 좋다.

    Set 인터페이스에는 HashSet, LinkedSet, TreeSet 같은 구현기능이 있다.
HashSet은 요소를 저장하는 집합으로, 중복을 허락하지않고 순서가 없다.
LinkedSet은 요소를 저장하는 집합이지만 삽입되는 순서를 기억한다.
TreeSet은 이진탐색트리(Binary search tree)라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다.
이진탐색트리는 정렬, 검색, 범위검색에 높은 성능을 보이는 자료구조이며, TreeSet은 이진탐색트리의 성능을 향상시킨 레드블랙트리로 구현되어있다.

    Map 인터페이스는 키와 값을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는 데 사용된다.
키는 중복될 수 없으며, 값은 중복될 수 있다. 기존에 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장된 값이 남게 된다.
Map의 메소드 중 Map.values()는 Collection 타입을 반환하고 Map.keySet()은 Set 타입을 반환한다.
Value는 중복이 가능하지만 Key는 중복이 불가능하기 때문이다.



문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.

문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요.
*/



