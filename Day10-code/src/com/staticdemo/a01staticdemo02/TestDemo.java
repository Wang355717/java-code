package com.staticdemo.a01staticdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/8 -  - 08 - 18:48
 * {@code @Description:} com.staticdemo.a01staticdemo02
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        String s = ArryUtil.printArr(arr);
        System.out.println(s);

        double[] arr2 = {10.5, 8.6, 5.4, 6.3, 5.1};
        double aerage = ArryUtil.getAerage(arr2);
        System.out.println(aerage);
    }
}
