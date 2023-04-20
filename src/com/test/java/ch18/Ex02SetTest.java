package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02SetTest {
    public static void main(String[] args) {
        String[] arrMenus = {"짜장면", "짬뽕", "된장찌개", "김치찌개", "탕수육"};
        System.out.println("arrMenus를 출력");
        System.out.println(Arrays.toString(arrMenus));
        
        Customer c1 = new Customer("A");
        c1.addMenu("짜장면");
        c1.addMenu("짬뽕");

        Customer c2 = new Customer("B");
        c2.addMenu("짜장면");
        c2.addMenu("탕수육");

        Customer c3 = new Customer("C");
        c3.addMenu("짜장면");
        c3.addMenu("김치찌개");

        Order order = new Order();
        order.setCustomers(c1, c2, c3);

        order.setMenus(arrMenus);
        Set<String> menus = order.getMenus();
        System.out.println("-----------메뉴 출력---------------");
        Order.print(menus);

        List<String> oMenus = order.getOrderedMenus();
        System.out.println("------------정렬한 메뉴 출력--------------");
        Order.print(oMenus);

        Set<String> rMenus = order.getRegisteredMenus();
        System.out.println("-------------주문한 메뉴 출력-------------");
        Order.print(rMenus);

        Set<String> bMenus = order.getBasicMenus();
        System.out.println("-------------주문한 메뉴 중 공통된 메뉴 출력-------------");
        Order.print(bMenus);

        List<String> oList = order.getOrderedRegisteredMenus();
        System.out.println("----------주문한 메뉴들을 정렬하여 출력-------------");
        Order.print(oList);

        Set<String> cMenus = order.getCanceledMenus();
        System.out.println("-----------한번도 주문되지 않은 메뉴 출력--------------");
        Order.print(cMenus);
    }
}

class Order {
    private Set<String> menus;
    private List<Customer> customers;

    public void setCustomers(Customer... arrCustomer) {
        customers = new ArrayList<>();
        Collections.addAll(customers, arrCustomer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setMenus(String[] arrMenus) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arrMenus);
        menus = new HashSet<>(list);
    }

    public Set<String> getMenus() {
        return menus;
    }

    public List<String> getOrderedMenus() {
        List<String> oMenus = new ArrayList<>(menus);
        Collections.sort(oMenus);
        return oMenus;
    }

    public Set<String> getRegisteredMenus() {
        Set<String> rMenus = new HashSet<>();
        for (Customer customer : customers) {
            rMenus.addAll(customer.getMenus());
        }
        return rMenus;
    }

    public Set<String> getBasicMenus() {
        Set<String> menus = null;
        for (Customer customer : customers) {
            if(menus == null)
                menus = new HashSet<>(customer.getMenus());
            menus.retainAll(customer.getMenus());
        }
        return menus;
    }

    public Set<String> getCanceledMenus() {
        Set<String> allMenus = new HashSet<>(menus);
        Set<String> rMenus = getRegisteredMenus();

        allMenus.removeAll(rMenus);
        return allMenus;
    }

    public List<String> getOrderedRegisteredMenus() {
        List<String> oList = new ArrayList<>(getRegisteredMenus());
        Collections.sort(oList);
        return oList;
    }

    public static void print(Collection<String> menus) {
        for (String menu : menus) {
            System.out.print(menu + ", ");
        }
        System.out.println("\n");
    }
}

class Customer {
    private String name;
    private Set<String> menus;

    public Customer(String name) {
        this.name = name;
        menus = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addMenu(String menu) {
        menus.add(menu);
    }

    public Set<String> getMenus() {
        return menus;
    }
}


/*
엘컴퓨터식당에는 짜장면, 짬뽕, 된장찌개, 김치찌개, 탕수육 식사 메뉴가 있습니다.
A는 짜장면, 짬뽕을 시켰습니다.
B는 짜장면, 탕수육을 시켰습니다.
C는 짜장면, 김치찌개를 시켰습니다.

문제 1.
주문한 모든 메뉴를 중복 없이 정렬하여 출력하세요.

문제 2.
모든 사람이 주문한 메뉴를 출력하세요.

문제 3.
한 명도 시키지 않은 메뉴들을 출력하세요.
*/