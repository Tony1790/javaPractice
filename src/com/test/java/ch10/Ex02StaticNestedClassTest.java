package com.test.java.ch10;

public class Ex02StaticNestedClassTest {
    public static void main(String[] args) {
        AAA.BBB.setPrice(50000);
        System.out.println(AAA.BBB.getPrice());

        AAA a = new AAA();
        a.setTitle("AAA");
        a.print();
    }
}

class AAA {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    static class BBB {
            static int price;

            public static void setPrice(int price){
                BBB.price = (int)(price * 2.5f);
            }

            static int getPrice(){
                return BBB.price;
            }
    }

    public void print(){
        System.out.println(title + "," + BBB.getPrice());
    }
}

/*
문제 1.
static 중첩 클래스를 사용한 예제를 작성하세요.
문제 2. (1)의 코드를 오류가 나지 않도록 수정하세요.
*/

