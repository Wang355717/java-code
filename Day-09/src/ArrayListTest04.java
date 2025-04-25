import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest04 {
    public static void main(String[] args) {
        /*需求:定义一个集合，添加一些学生对象，并进行遍历学生类的
        属性为:姓名，年龄。
        要求:对象的数据来自键盘录入*/

        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 2.创建学生对象并且录入信息
            Student stu = new Student();
            System.out.print("请输入学生姓名:");
            String name = scanner.next();
            System.out.print("请输入学生年龄:");
            int age = scanner.nextInt();

            // 3.将数据存入到学生对象中
            stu.setName(name);
            stu.setAge(age);

            // 4.将学生对象存入到集合list中
            list.add(stu);
        }

        // 5.遍历集合
        for (int i = 0; i < list.size(); i++) {
            // list.get(i)  元素/学生对象
            // System.out.println(list.get(i));

            Student stu = list.get(i);
            System.out.println(stu.getAge() + " " + stu.getName());
        }
    }
}

