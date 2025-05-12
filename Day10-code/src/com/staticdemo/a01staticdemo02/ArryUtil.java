package com.staticdemo.a01staticdemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/8 -  - 08 - 18:35
 * {@code @Description:} com.staticdemo.a01staticdemo01.a01staticdemo02
 */
public class ArryUtil {
    /*
     * 提供一个工具类方法printArr，用于返回整数数组的内容返回的字符串格式如:[10,20,50,34,100]
     * (只考虑整数数组，且只考虑一维数组)
     * 提供这样一个工具方法getAerage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
     * 定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。
     * */
    // 私有化构造方法
    private ArryUtil() {
    }

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            // 如果i是数组的最后一个元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
