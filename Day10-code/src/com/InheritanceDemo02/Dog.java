package com.InheritanceDemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/12 -  - 12 - 16:56
 * {@code @Description:} com.InheritanceDemo02
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" +getColor() + "颜色的狗两只前腿死死保住" + something + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
