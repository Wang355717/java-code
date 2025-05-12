package com.extendsdemo;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 16:52
 * {@code @Description:} com.extendsdemo
 */
public class extent {
    public static void main(String[] args) {
        student s = new student("zhangsan",23);
    }
}

class person{
    int age;
    String name;
    public person(){
        System.out.println("父类的无参构造");
    }
    public person( String name,int age){
        this.age = age;
        this.name = name;
    }
}

class student extends person{
    public student(){
        // 子类构造方法中隐藏super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }
    public student(String name,int age){
        super(name,age);
    }

}