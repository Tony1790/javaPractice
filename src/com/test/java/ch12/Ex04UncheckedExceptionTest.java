package com.test.java.ch12;

        import java.io.File;
public class Ex04UncheckedExceptionTest {
    public static void main(String[] args) {
        File f = new File("./src/com/test/java/ch12/hello.txt");

        try {
            f.createNewFile(); //Checked Exception
        } catch (Exception e) {
            System.out.println("error!");
        }
    }
}





/*
문제 1.
f.createNewFile 의 주석을 제거합니다.
발생된 예외를 try catch 를 이용하여 처리하세요.
*/