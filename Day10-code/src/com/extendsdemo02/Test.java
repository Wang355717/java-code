package com.extendsdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 18:43
 * {@code @Description:} com.extendsdemo02
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(10,"张三",18000,8000);
        System.out.println(manager.getId() + ", " + manager.getName() + ", "
        + manager.getSalary() + ", " + manager.getSalary());
        manager.work();
        manager.eat();

        Cook cook = new Cook();
        cook.setId(20);
        cook.setName("李四");
        cook.setSalary(1500.0);
        System.out.println(cook.getId() + ", " + cook.getName() + ", "
                + cook.getSalary());
        cook.work();
        cook.eat();
    }
}
