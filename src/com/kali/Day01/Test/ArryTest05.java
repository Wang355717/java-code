package com.kali.Day01.Test;

import java.util.Random;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/5 -  - 05 - 23:05
 * @Description: com.kali.Day01.Test
 */
public class ArryTest05 {
    public static void main(String[] args) {
        /*需求:生成10个1~100之间的随机数存入数组
            求出所有数据的和
            求所有数据的平均数
            统计有多少个数据比平均值小
        */
        // 1.生成10个随机数存入数组
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        //2.定义一个求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组所有数据和是:" + sum);

        // 3.求平均数
        int avg = sum / arr.length;
        System.out.println("数据平均数是:" + avg);

        // 4.统计有多少个比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg){
                count++;
            }
        }
        System.out.println("数据比平均值小有:" + count + "个");
    }
}
