package com.kali.Day01.Test;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 22:12
 * @Description: com.kali.Day01
 */
public class ArryTest03 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        遍历每个数组
        要求：
            1.如果是奇数，则将当前数字扩大两倍
            2.如果是偶数，则将当前数字变成二分之一
        */
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 == 0){
                arry[i] = arry[i] / 2;
            }else {
                arry[i] = arry[i] * 2;
            }
        }
        // 最后更新并且遍历数组
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
}

