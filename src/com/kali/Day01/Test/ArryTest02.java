package com.kali.Day01.Test;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 22:00
 * @Description: com.kali.Day01
 */
public class ArryTest02 {
    public static void main(String[] args) {
        // 定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        // 遍历每一个元素，统计数组里面一共有几个被3整除的数

        // 定义一个变量存储个数
        int count = 0;
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arry.length; i++) {
            // System.out.println(arry[i]);
            // 整除要用取余
            if (arry[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("数组ary能被3整除的数有" + count + "个");
    }
}
