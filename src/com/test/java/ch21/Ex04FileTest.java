package com.test.java.ch21;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex04FileTest {
    public static void main(String[] args) {
        String dir1 = System.getProperty("user.dir");
        String packagePath = "com/test/java/ch21";
        String fileName = "Ex04Test.txt";

        Path p1 = Paths.get(dir1).resolve(packagePath).resolve(fileName);
        try {
            Files.createFile(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = "임의의 내용";
        try(BufferedWriter out = Files.newBufferedWriter(p1, Charset.forName("UTF-8"))) {
            out.write(line, 0, line.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
*
* 상대경로는 현재 파일을 기점으로 나타내는 경로이다.
*
* 절대경로는 root 파일부터 현재파일까지 나타내는 경로이다.
*
*
* */

/*
문제 1.
현재 패키지에 빈파일을 생성 후 임의의 내용을 출력하세요.
Path, createFile, newBufferedWriter를 사용하세요.

문제 2.
상대경로와 절대경로에 대해 알아보고 차이점을 작성하세요.
*/