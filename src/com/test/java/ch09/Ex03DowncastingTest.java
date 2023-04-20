package com.test.java.ch09;

public class Ex03DowncastingTest {

    public static void main(String[] args) {
        Book3 book = null;
        EBook3 ebook = null;
        ABook abook = null;

        book = new Book3();
        book.setTitle("자바 기본문법");
        System.out.println(book.getTitle());

        book = new EBook3();
        book.setTitle("자바 알고리즘");
        System.out.println(book.getTitle());
        //book.setFontColor("블랙");
        ebook = (EBook3)book;		// 다운캐스팅
        ebook.setFontColor("블랙");
        System.out.println(ebook.getFontColor());

        book = new ABook();
        book.setTitle("파이썬 알고리즘");
        System.out.println(book.getTitle());
        abook = (ABook)book;
        abook.setVolume(50);
        System.out.println(abook.getVolume());

    }

}

class ABook extends Book3 {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

/*
문제 1.
오디오북 클래스를 추가하세요.
볼륨을 저장하는 정수타입의 속성을 추가하세요.
main 메소드에서 다운캐스팅을 사용하여 오디오북의 볼륨을 출력하는 코드를 작성하세요.
*/