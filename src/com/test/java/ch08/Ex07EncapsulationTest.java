package com.test.java.ch08;

public class Ex07EncapsulationTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(2);
        dog1.setName("호두");
        dog1.setBreed("보더콜리");
        dog1.setVaccinated(true);
        dog1.setOwner("Tony");

        Dog dog2 = new Dog();
        dog2.setAge(8);
        dog2.setName("왕자");
        dog2.setBreed("진돗개");
        dog2.setVaccinated(false);
        dog2.setOwner("Oliver");

        Dog.printInfo(dog1);
        Dog.printInfo(dog2);
    }
}

class Dog {
    private String breed;
    private String name;
    private String owner;
    private int age;
    private boolean vaccinated;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public static void printInfo(Dog dog){
        String vaccine = "예방접종 완료";
        if(dog.vaccinated != true)
            vaccine = "예방접종 미완료";
        System.out.println(dog.name + ", " + dog.breed + ", " + dog.age + "살, " + dog.owner + ", " + vaccine);
    }

}

