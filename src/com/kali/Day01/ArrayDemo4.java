package com.kali.Day01;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 22:26
 * @Description: com.kali.Day01
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        // 数组的动态初始化
        // 格式：数据类型[] 数组名 = new 数据类型[数组的长度]
        String[] name = new String[50];

        name[0] = "小明";
        name[1] = "小红";
        System.out.println(name[0] + name[1]);
        System.out.println(name[2]);    // 数组默认初始值是Null

        /*
        * 数组的默认值的规律：
        * 整数类型：默认值0
        * 浮点类型：默认值0.0
        * 字符类型：默认值'/u0000'(空格)
        * 布尔类型：默认值false
        * 引用类型：默认值null
        * */
    }
}
