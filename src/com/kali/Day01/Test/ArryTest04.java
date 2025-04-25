package com.kali.Day01.Test;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 22:48
 * @Description: com.kali.Day01.Test
 */
public class ArryTest04 {
    public static void main(String[] args) {
        // 求数组的最大值
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 假设数组的第一个值最大
        int max = arry[0];
        // 循环条件为0时，自己和自己比较没有意义
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max){
                max = arry[i];
            }
        }
        System.out.println(max);
    }
}
