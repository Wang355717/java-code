package com.staticdemo.a01staticdemo01;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/8 -  - 08 - 13:19
 * {@code @Description:} com.staticdemo.a01staticdemo01
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender );
    }
}
