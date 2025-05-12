package com.extendsdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/11 -  - 11 - 18:11
 * {@code @Description:} com.extendsdemo02
 */
public class Employee {
    private double id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(double id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工在工作");
    }
    public void eat(){
        System.out.println("员工在工作");
    }
}
