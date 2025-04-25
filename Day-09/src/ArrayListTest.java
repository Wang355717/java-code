import java.util.ArrayList;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/22 -  - 22 - 22:19
 * @Description: PACKAGE_NAME
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // 需求:定义一个集合，添加字符串，并进行遍历遍历格式参照:[元素1,元素2,元素3]。
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        // 遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            // 如果i是最后一个元素，则直接打印
            if (i == list.size() -1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
