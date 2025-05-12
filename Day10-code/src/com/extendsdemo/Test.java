package com.extendsdemo;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/10 -  - 10 - 12:19
 * {@code @Description:} com.extendsdemo
 */
public class Test {
    public static void main(String[] args) {
        Studen s1 = new Studen();
        s1.lunch();
    }
}

class Person{
    public static void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}

class Studen extends Person{
    public void lunch(){
        // this会在本类中调用
        this.eat();
        this.drink();

        //super会直接在父类中调用方法
        super.eat();
        super.drink();
    }
    public static void eat(){
        System.out.println("吃意大利面");
    }
    public void drink(){
        System.out.println("喝凉水");
    }
}
