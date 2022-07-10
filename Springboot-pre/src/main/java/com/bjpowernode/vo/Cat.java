package com.bjpowernode.vo;

public class Cat {
    private String cardId;
    private String name;
    private int age;

    public String getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
