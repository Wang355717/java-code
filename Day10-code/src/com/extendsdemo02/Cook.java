package com.extendsdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 18:40
 * {@code @Description:} com.extendsdemo02
 */
public class Cook extends Manager{
    public Cook() {
    }

    public Cook(double id, String name, double salary, double bouns) {
        super(id, name, salary, bouns);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }

    @Override
    public void eat() {
        System.out.println("厨师在吃饭");
    }
}
