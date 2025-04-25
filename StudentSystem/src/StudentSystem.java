import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther: kali-莫小领
 * @Date: 2025/4/23 -  - 23 - 16:48
 * @Description: PACKAGE_NAME
 */
public class StudentSystem {
    public static void main(String[] args) {
        // 定义一个集合用于存储学生信息
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("----------学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            switch (next) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> modifyStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("5:退出");
                    // break loop;
                    System.exit(0); // 停止虚拟机的运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // 添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        String id;
        // 循环检查id是否重复
        while (true) {
            System.out.print("请输入学生id:");
            id = scanner.next();
            if (contains(list, id)) {
                System.out.println("id已存在，请重新输入！");
            } else {
                break; // id唯一，退出循环
            }
        }

        // 继续录入其他信息
        System.out.print("请输入学生姓名:");
        String name = scanner.next();

        System.out.print("请输入学生年龄:");
        int age = scanner.nextInt();

        System.out.print("请输入学生住址:");
        String address = scanner.next();

        // 创建学生对象并添加到集合
        Student student = new Student(id, name, age, address);
        list.add(student);
        System.out.println("学生信息添加成功！");
    }

    // 删除学生方法
    public static void delStudent(ArrayList<Student> list) {
        /*录入学生Id
         * id存在删除
         * id不存在，需要提示不存在
         * 并回到初始菜单
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的学生id:");
        String id = scanner.next();

        // 对返回来的索引进行判断，如果大于0表示存在，则直接删除，否则取反
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "成功删除");
        } else {
            System.out.println("id不存在，删除失败");
        }

    }

    // 修改学生方法
    public static void modifyStudent(ArrayList<Student> list) {
        /*录入学生Id
         * id存在，继续录入其他信息
         * id不存在，需要提示不存在
         * 并回到初始菜单
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要修改的学生id:");
        String id = scanner.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("学生id为" + id + "的信息不存在，删除失败");
            return;
        }
        // 执行到这里表示学生信息存在
        // 获取要修改的学生对象
        Student student = list.get(index);

        // 修改学生对应信息
        System.out.print("请输入要修改的学生姓名:");
        String newName = scanner.next();
        student.setName(newName);
        System.out.print("请输入要修改的学生年龄:");
        int newAge = scanner.nextInt();
        student.setAge(newAge);
        System.out.print("请输入要修改的学生地址:");
        String newAdderss = scanner.next();
        student.setName(newAdderss);
    }

    // 查询学生方法
    public static void queryStudent(ArrayList<Student> list) {
        /*
         * 如果没有学生信息，提示:当前无学生信息，
         * 请添加后再查询如果有学生信息，需要按照以下格式输出
         * */
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后在查询");
            return;
        }
        // 打印表头信息
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress() + "\t");
        }
    }

    // 判断id是否存在的方法
    public static boolean contains(ArrayList<Student> list, String id) {
        // 遍历集合
        /*for (int i = 0; i < list.size(); i++) {
            // 判断集合里面的学生对象的id属性和参数id是否相同
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;*/
        // 调用getIndex方法
        return getIndex(list, id) >= 0;
    }

    // 根据元素查找索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个学生对象
            Student student = list.get(i);
            // 得到学生对象id
            String stu = student.getId();
            // 集合中的学生id和查询的id是否相同
            if (stu.equals(id)) {
                // 相同返回索引
                return i;
            }
        }
        return -1;
    }
}
