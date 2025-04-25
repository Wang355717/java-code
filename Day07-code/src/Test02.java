public class Test02 {
    // 判断101~200之间有多少个素数，并且打印出来
    public static void main(String[] args) {
        // 循环遍历101~200
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // 2。判断数字是否素数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i+",");
                count++;
            }
        }
        System.out.println("素数一个有" + count + "个");
    }
}
