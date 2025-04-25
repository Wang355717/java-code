import java.util.Scanner;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/14 -  - 14 - 23:15
 * @Description: PACKAGE_NAME
 */
public class Test05 {
    public static void main(String[] args) {
        /*
        * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        * 选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        * */
        int[] score = getArr();
        int max = score[0];
        int min = score[0];
        int number = 0;
        for (int i = 0; i < score.length; i++) {
            // 最大值
            max = Math.max(score[i], max);
            // 最小值
            min = (score[i] < min) ? score[i] : min;
            // 总的成绩
            number += score[i];
        }
        double average = (number - max - min) / 4.0;
        System.out.println("平均成绩是:" + average);
    }
    // 1.定义一个数组存放6个成绩
    public static int[] getArr(){
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            System.out.print("请输入学生成绩:");
            int scores = scanner.nextInt();
            // 判断成绩是否在0~100之间
            if (scores >=0 && scores <= 100){
                arr[i] = scores;
                i++;
            }else {
                System.out.println("输入的成绩超出范围，请输入0~100之间");
            }
        }
        return arr;
    }
}
