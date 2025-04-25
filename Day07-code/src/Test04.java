/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/14 -  - 14 - 0:32
 * @Description: PACKAGE_NAME
 */
public class Test04 {
    public static void main(String[] args) {
        // 把一个数组中的元素复制到另一个新数组中去
        // 1.定义一个老数组
        int[] arr = {1, 2, 3, 4, 5};
        // 2.定义一个新的数组，长度和老数组一样
        int[] newArr = new int[arr.length];
        // 3.遍历老数组中的元素，并且赋值到新的数组当中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
