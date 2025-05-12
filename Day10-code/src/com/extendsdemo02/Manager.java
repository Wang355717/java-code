package com.extendsdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 18:15
 * {@code @Description:} com.extendsdemo02
 */
public class Manager extends Employee{
    private double bouns;

    public Manager(){}

    // 带全部参数的
    // 子类 + 父类
    public Manager(double id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
