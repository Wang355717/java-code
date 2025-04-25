package com.String;


/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/21 -  - 21 - 17:45
 * @Description: com.String
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        // 1.添加元素（任意类型）
        /*sb.append(4);
        sb.append(12.3);
        sb.append(true);*/

        // 2.翻转字符串
        sb.reverse();

        // 3.获取字符串的长度
        int len = sb.length();
        System.out.println(len);

        // 4.toString()方法
        String str = sb.toString(); // 将StringBuilder变回字符串
        System.out.println(str);


        System.out.println(sb);
    }
}
