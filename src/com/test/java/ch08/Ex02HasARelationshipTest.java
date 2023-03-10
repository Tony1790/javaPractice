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

    String print() { return "?????????: " +brand+ ", ?????????: "+nation+", ?????????: "+marketShare+"%";}

    static void info(Manufactor manufactor) {
        System.out.println(manufactor.brand + "??? ???????????? ???????????? ????????? " + manufactor.flagshipModel.name + " ?????? ????????? "+ manufactor.flagshipModel.price + " ??? ?????????.");
    }
}

class FlagshipModel{
    String name;
    int price;
}

/*
?????? 1.
???????????? ????????? ???????????? ??????????????? ????????? HAS-A ????????? ??????????????????.
*/