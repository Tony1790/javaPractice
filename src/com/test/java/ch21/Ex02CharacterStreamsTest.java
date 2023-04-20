package com.test.java.ch21;

import java.io.*;
import java.util.Scanner;

public class Ex02CharacterStreamsTest {
    public static void main(String[] args) {
        try(
                BufferedReader in =
                        new BufferedReader(
                                new FileReader("com/test/java/ch21/Ex02test.txt"));

                LineNumberReader lineNumberReader =
                        new LineNumberReader(
                                new FileReader(
                                        "com/test/java/ch21/Ex02test.txt"));

                BufferedWriter out =
                        new BufferedWriter(
                                new FileWriter("com/test/java/ch21/out2_Ex02test.txt"));
        ) {
            String line;
            while((line = lineNumberReader.readLine()) != null) {
                out.write(lineNumberReader.getLineNumber() + ". " + line);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



/*
문제 1.
문장들이 적힌 텍스트 파일을 생성하세요.
버퍼를 사용해 텍스트 파일을 읽어 들인 후 줄 번호와 함께 내용들을 출력하세요.
예)
1. 안녕하세요.
2. Hello.
*/