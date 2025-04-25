package com.String;

import java.util.StringJoiner;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/21 -  - 21 - 18:11
 * @Description: com.String
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
        // 参数：数据以什么形式分割，在数据开始添加，在数据结尾添加
        StringJoiner sj = new StringJoiner(",", "[", "]");

        // 添加元素(只能是字符串)
        sj.add("aa").add("bb").add("cc");
        System.out.println(sj);

        // 统计StringJoiner容器的长度
        int len = sj.length();
        System.out.println(len);    //10,添加的元素和分隔符全部算上

        // 4.toString()方法
        String str = sj.toString(); // 将StringBuilder变回字符串
        System.out.println(str);
    }
}
