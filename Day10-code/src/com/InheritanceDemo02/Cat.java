package com.InheritanceDemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/12 -  - 12 - 16:57
 * {@code @Description:} com.InheritanceDemo02
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
