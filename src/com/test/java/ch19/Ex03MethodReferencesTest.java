package com.test.java.ch19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class Ex03MethodReferencesTest {
    public static void main(String[] args) {
        StoreA store = new StoreA();
        String[] titles = {"JAVA", "C", "PYTHON", "C#", "RUBY", "JAVASCRIPT", "GO"};

        store.addAll(titles, Booka::new, Booka::validateLength);
        Collections.sort(store.getItems(), ItemA::compareByTitleDesAsc);

        Runnable printItems = store::forEach;
        printItems.run();
        System.out.println();

        StoreA store2 = new StoreA();

        store2.itemsWhichIsNotValidated(titles, Booka::new, Booka::validateLength);

        Runnable printItems2 = store2::forEach;
        printItems2.run();
        System.out.println();

        Consumer<StoreA> printItems3 = StoreA::forEach;
        printItems3.accept(store2);
        System.out.println();
    }
}

class StoreA {
    private List<ItemA> items = new ArrayList<>();


    public void addAll(String[] titles, Function<String, ItemA> createItem, Predicate<String> validateItem) {
        for (String title : titles) {
            if (validateItem.test(title))
                items.add(createItem.apply(title));
        }
    }

    public void itemsWhichIsNotValidated(String[] titles, Function<String, ItemA> createItem, Predicate<String> validateItem) {
        for (String title : titles) {
            if(!(validateItem.test(title)))
                items.add(createItem.apply(title));
        }
    }

    public void removeItemIfShorterThenFiveCharacter(List<ItemA> items ,Predicate<ItemA> validateItem) {
        for(ItemA item : items) {
            if(!(validateItem.test(item)))
                items.remove(item);
        }
    }

    public List<ItemA> getItems() {
        return items;
    }

    public void forEach() {
        for(ItemA item : items) {
            System.out.println("[title] " + item.getTitle());
        }
    }
}

interface ItemA {
    public abstract String getTitle();

    public static int compareByTitleAsc(ItemA it1, ItemA it2) {
        return it1.getTitle().compareTo(it2.getTitle());
    }

    public static int compareByTitleDesAsc(ItemA it1, ItemA it2) {
        return it1.getTitle().compareTo(it2.getTitle()) * -1;
    }
}

class Booka implements ItemA {
    public static final int TITLE_MAX_LENGTH = 5;

    private String title;

    public Booka(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public static boolean validateLength(String title) {
        return title.length() <= TITLE_MAX_LENGTH;
    }

    public static int compareByTitle(Booka b1, Booka b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

/*
문제 1.
Store의 Item을 메소드 참조를 이용하여 내림차순으로 정렬하세요.
문제 2.
인스턴스 메소드를 Store에 추가후 메소드 참조를 통해 호출하세요.
메소드 참조를 이용하여 인스턴스 메소드를 호출하는 두 가지 방식 모두 사용하세요.
*/