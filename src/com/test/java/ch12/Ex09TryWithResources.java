package com.test.java.ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex09TryWithResources {
    public static void main(String[] args) {
        try1();

        System.out.println("\n\n------------\n");

        try2();
    }

    public static void try1() {
        try(
                FileReader fr = new FileReader("./src/com/test/java/ch12/Ex01TryCatch.java");
                BufferedReader br = new BufferedReader(fr);
        ) {
                int data;
                while((data = br.read()) != -1) {
                    char ch = (char) data;
                    System.out.print(ch);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void try2() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("./src/com/test/java/ch12/Ex01TryCatch.java");
            br = new BufferedReader(fr);

            int data;
            while ((data = br.read()) != -1) {
                char ch = (char) data;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

