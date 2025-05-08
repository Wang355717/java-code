import java.util.ArrayList;

public class ArrayListTest03 {
    public static void main(String[] args) {
        // 需求:定义一个集合，添加一些学生对象，
        // 并进行遍历学生类的属性为:姓名，年龄

        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建学生对象
        Student s1 = new Student("张三",17);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",19);

        // 3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            // list.get(i)  元素/学生对象
            // System.out.println(list.get(i));

            Student stu = list.get(i);
            System.out.println(stu.getAge() + " " + stu.getName());
        }
    }
}
