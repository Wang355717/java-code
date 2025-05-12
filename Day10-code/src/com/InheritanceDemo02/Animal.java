package com.InheritanceDemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/12 -  - 12 - 16:53
 * {@code @Description:} com.InheritanceDemo02
 */
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something){
        System.out.println("动物在吃" + something);
    }
}
