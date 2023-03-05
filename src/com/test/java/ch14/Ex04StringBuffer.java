package com.test.java.ch14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ex04StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("자바");
        sb.append(" ").append("문법 ").append("엘컴퓨터학원 ");
        sb.append(123);
        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer("자바");
        sb2.append(" ").append("문법 ").append("엘컴퓨터학원 ");
        sb2.append(123);
        String str2 = sb2.toString();
        System.out.println(str2);

        long startTime = 0;
        long endTime = 0;
        String str3 = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str3 += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(endTime - startTime);

        System.out.println();

        startTime = 0;
        endTime = 0;
        StringBuffer sb3 = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb3.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
