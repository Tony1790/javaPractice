
package com.test.java.ch09;

public class Ex06InterfaceTest {
}

class Storage {
    Inventory[] items;
    int index;

    public Storage() {
        items = new Inventory[10];
        index = 0;
    }

    public void add(Inventory item) {
        items[index] = item;
        index++;
    }

    public Inventory[] get() {
        return items;
    }
}

interface Inventory {
    public abstract String getStoreName();
    public abstract int getStorePrice();
    public abstract String getStoreInDate();
    public abstract String getStoreOutDate();
}

class Pen implements Inventory, printService {
    private String name;
    private String inDate;
    private String outDate;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String getStoreName(){
        return name;
    }
    @Override
    public int getStorePrice(){
        return price;
    }
    @Override
    public String getStoreInDate(){
        return inDate;
    }
    @Override
    public String getStoreOutDate(){
        return outDate;
    }
    @Override
    public void printInfo() {
        System.out.println("----------");
        System.out.println("상품 이름: " + getName());
        System.out.println("상품 가격: " + getPrice());
        System.out.println("입고 날짜: " + getInDate());
        System.out.println("출고 날짜: " + getOutDate());
        System.out.println("----------");
    }
}

class Papers implements Inventory, printService{
    private String name;
    private int price;
    private int countOfPaper;
    private String inDate;

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    private String outDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountOfPaper() {
        return countOfPaper;
    }

    public void setCountOfPaper(int countOfPaper) {
        this.countOfPaper = countOfPaper;
    }

    @Override
    public String getStoreName(){
        return name;
    }
    @Override
    public int getStorePrice(){
        return price;
    }
    @Override
    public String getStoreInDate(){
        return inDate;
    }
    @Override
    public String getStoreOutDate(){
        return outDate;
    }
    @Override
    public void printInfo() {
        System.out.println("----------");
        System.out.println("상품 이름: " + getName());
        System.out.println("상품 가격: " + getPrice());
        System.out.println("입고 날짜: " + getInDate());
        System.out.println("출고 날짜: " + getOutDate());
        System.out.println("----------");
    }
}

class Eraser implements Inventory, printService{
    private String name;
    private String inDate;
    private String outDate;
    private int price;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getStoreName(){
        return name;
    }
    @Override
    public int getStorePrice(){
        return price;
    }
    @Override
    public String getStoreInDate(){
        return inDate;
    }
    @Override
    public String getStoreOutDate(){
        return outDate;
    }
    @Override
    public void printInfo() {
        System.out.println("----------");
        System.out.println("상품 이름: " + getName());
        System.out.println("상품 가격: " + getPrice());
        System.out.println("입고 날짜: " + getInDate());
        System.out.println("출고 날짜: " + getOutDate());
        System.out.println("----------");
    }
}

class ruler {

}

interface printService{
    public abstract void printInfo();
        }




/*
문제 1.
상품들을 창고에 저장하고 창고에 저장된 상품들을 출력하세요.
창고에 저장될 재고의 정보는 상품명, 가격, 입고일자(String), 출고일자(String) 입니다.
모든 상품이 재고 정보를 가지고 있지 않고 재고 인터페이스를 구현한 상품은 재고 정보를 가지고 있습니다.
재고 인터페이스를 구현한 상품만 창고에 저장이 가능하도록 구현하세요.
힌트) 창고 클래스, 재고 인터페이스, 재고 인터페이스가 적용된 상품 클래스들, 재고들이 저장될 배열 등이 필요합니다.
*/
