package com.staticdemo.a01staticdemo01;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/8 -  - 08 - 13:24
 * {@code @Description:} com.staticdemo.a01staticdemo01
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.setGender("男");
        stu1.Study();
        stu1.show();
    }
}
