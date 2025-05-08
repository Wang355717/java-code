import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 1.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 3.删除元素(删除成功返回True，否则返回False)
        // boolean result = list.remove("aaa");
        // System.out.println(result);
        // // 根据索引删除元素并且返回被删除的元素
        // String str = list.remove(1);
        // System.out.println(str);

        // 4.修改元素（修改那个索引的元素，并且返回被修改的元素）
        String stri = list.set(1, "hhh");
        System.out.println(stri);

        // 5.查找元素(查找索引的元素，并且返回该元素)
        String s = list.get(0);
        System.out.println(s);

        System.out.println(list);

        // 6.遍历
        for (int i = 0; i < list.size(); i++) {
            // i  索引
            // list.get(i)  元素
            String s1 = list.get(i);
            System.out.println(s1);
        }
    }
}