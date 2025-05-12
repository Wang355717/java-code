package com.InheritanceDemo;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 21:11
 * {@code @Description:} com.InheritanceDemo
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        if (a instanceof Dog d){
            d.lookHome();
        } else if (a instanceof Cta c) {
            c.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转化");
        }
    }
}

class Animal{
    public void show(){
        System.out.println("Animal---show方法");
    }
}

class Dog extends Animal{

    public void lookHome(){
        System.out.println("狗在睡觉");
    }
    @Override
    public void show() {
        System.out.println("狗吃骨头");
    }
}

class Cta extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
    @Override
    public void show() {
        System.out.println("猫吃小鱼");
    }
}