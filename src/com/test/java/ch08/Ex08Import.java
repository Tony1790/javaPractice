package com.test.java.ch08;

import java.util.Calendar;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.floor;

public class Ex08Import {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        System.out.println(d.toString());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));

        System.out.println(PI);
        System.out.println(random());
        System.out.println(round(3.14));
    }
}
