package com.test.java.ch08;

public class Ex02HasARelationshipTest {
    public static void main(String[] args) {
        Manufactor m1 = new Manufactor();
        m1.brand = "Samsung";
        m1.nation = "Korea";
        m1.marketShare = 19;

        Manufactor m2 = new Manufactor();
        m2.brand = "Xiaomi";
        m2.nation = "China";
        m2.marketShare = 11;

        Manufactor m3 = new Manufactor();
        m3.brand = "Oppo";
        m3.nation = "China";
        m3.marketShare = 10;

        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.putManufactor(m1);
        AndroidPhone.print(m1);

        androidPhone.putManufactors(m1,m2,m3);
        AndroidPhone.print(androidPhone.manufactors);

        FlagshipModel f1 = new FlagshipModel();
        f1.name = "Galaxy";
        f1.price = 1390000;

        FlagshipModel f2 = new FlagshipModel();
        f2.name = "Find";
        f2.price = 1700000;

        FlagshipModel f3 = new FlagshipModel();
        f3.name = "Redmi";
        f3.price = 1190000;

        m1.flagshipModel = f1;
        m2.flagshipModel = f2;
        m3.flagshipModel = f3;

        Manufactor.info(m1);
        Manufactor.info(m2);
        Manufactor.info(m3);
    }

}


class AndroidPhone {
    Manufactor manufactor; // HAS-A Relationship
    FlagshipModel flagshipModel; // HAS-A Relationship
    Manufactor[] manufactors;// HAS-A Relationship
    int count;

    void putManufactor(Manufactor manufactor) {
        this.manufactor = manufactor;
    }

    void putManufactors(Manufactor... manufactors){
        this.manufactors = manufactors;
    }

    static void print(Manufactor manufactor){
        System.out.println(manufactor.print());
    }

    static void print(Manufactor[] manufactors) {
        if(manufactors != null) {
            for (int i = 0; i < manufactors.length; i++) {
                System.out.println(manufactors[i].print());
            }
        }
    }

}

class Manufactor{
    String brand;
    String nation;
    int marketShare;

    FlagshipModel flagshipModel; // HAS-A Relationship

    String print() { return "브랜드: " +brand+ ", 제조국: "+nation+", 점유율: "+marketShare+"%";}

    static void info(Manufactor manufactor) {
        System.out.println(manufactor.brand + "의 대표적인 플래그십 모델은 " + manufactor.flagshipModel.name + " 이며 가격은 "+ manufactor.flagshipModel.price + " 원 입니다.");
    }
}

class FlagshipModel{
    String name;
    int price;
}

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요.
*/