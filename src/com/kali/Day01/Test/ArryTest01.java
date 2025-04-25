package com.kali.Day01.Test;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 21:58
 * @Description: com.kali.Day01
 */
public class ArryTest01 {
    public static void main(String[] args) {
        // 定义一个数组，求出所有的元素的和
        int[] arr = {5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
