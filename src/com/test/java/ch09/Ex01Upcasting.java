package com.test.java.ch09;

public class Ex01Upcasting {
    public static void main(String[] args) {
        Book book = null;
        book = new Book();
        book.setTitle("자바기본문법");
        System.out.println(book.getTitle());

        System.out.println();

        book = new EBook();
        book.setFontColor("블랙");
        System.out.println("폰트 컬러: " + book.getFontColor());
        book.setTitle("자바 자료구조");
        System.out.println(book.getTitle());

        System.out.println();

        book = new AudioBook();
        book.setTitle("앵무새 죽이기");
        System.out.println(book.getTitle());
        book.setVoiceActor("강수진");
        System.out.println(book.getVoiceActor());
    }
}

class Book {
    private String title;
    String fontColor;
    String voiceActor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public String getVoiceActor() {
        return voiceActor;
    }

    public void setVoiceActor(String voiceActor) {
        this.voiceActor = voiceActor;
    }
}

class EBook extends Book {

    @Override
    public String getFontColor() {
        return fontColor;
    }

    @Override
    public void setFontColor(String fontColor) {
        super.fontColor = fontColor;
    }

    @Override
    public void setTitle(String title) {
        title = "[EBOOK]" + title;
        super.setTitle(title);
    }

}


class AudioBook extends Book {
    @Override
    public void setTitle(String title) {
        title = "[AUDIOBOOK]" + title;
        super.setTitle(title);
    }

    @Override
    public void setVoiceActor(String voiceActor) {
        this.voiceActor = voiceActor;
    }
}
/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.

문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요.
*/
