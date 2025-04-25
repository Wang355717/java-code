import java.util.ArrayList;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/23 -  - 23 - 15:46
 * @Description: PACKAGE_NAME
 */
public class ArrayListTest05 {
    public static void main(String[] args) {
        /*需求:
            1，main方法中定义一集合，存入三个用户对象。
            用户屈性为:id，username，password
            2，要求:定义一个方法，根据id查找对应的用户信息。
            如果存在，返回索
            引如果不存在，返回-1
            */

        // 1.创建集合
        ArrayList<User> list = new ArrayList<>();

        // 2.创建用户对象
        User user1 = new User("001","张三","123456");
        User user2 = new User("002","李四","admin");
        User user3 = new User("003","王五","1234");

        // 3.将学生对象添加到集合当中
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 5.调用方法
        int flag = contains(list, "003");
        System.out.println(flag);

        // 4.定义方法
        /*
        * 1.我要干什么？  根据id查找集合里面的用户
        * 2.我做这件事需要什么？  list id
        * 3.调用处是否使用     是
        * */
    }
    public static int contains(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            // list.get(i):集合里面的用户对象
            // .getId():集合里面的用户对象的id属性，最后判断
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        // 当循环结束，集合里面的用户id没有一样的，最后返回false
        return -1;
    }
}
