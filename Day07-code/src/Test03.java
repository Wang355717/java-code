import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        // 1.生成一个数组存放大小写字母
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                // 添加小写字母
                chars[i] = (char) (97 + i);
            } else {
                // 添加大写字母
                chars[i] = (char) (65 + i - 26);
            }
        }
        // 2.随机抽取4次
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(chars.length);
            // 字符串的拼接
            result += chars[randomIndex];
        }
        // 3.随机在0~9抽取一个
        int number = random.nextInt(10);
        result += number;

        System.out.println(result);
    }
}
