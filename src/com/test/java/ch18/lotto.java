package com.test.java.ch18;

import java.util.*;

public class lotto {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            set.add((int)(Math.random() * 45) + 1);
        }

        System.out.println(set);
    }
}
