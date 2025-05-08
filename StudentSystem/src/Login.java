import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/4/25 -  - 25 - 12:55
 * {@code @Description:} com.studentCode
 */
public class Login {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<User> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.print("请选择操作：1登录 2注册 3忘记密码:");
            String choose = scanner.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出，欢迎下次再来");
                    // 结束JVM虚拟机进程
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // login登录方法
    public static void login(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        // 限制用户输入3次
        for (int i = 0; i < 3; i++) {
            // 1.判断用户是否存在
            System.out.print("请输入用户名:");
            String username = scanner.next();
            boolean flag = contains(list, username);
            if (!flag){
                System.out.println("用户名" + username + "不存在，请先注册");
                return;
            }
            // 2.密码
            System.out.print("请输入密码：");
            String password = scanner.next();
            // 2.验证码
            while (true) {
                String verification = getVerification();
                System.out.println("验证码为：" + verification);
                System.out.print("请输入验证码:");
                String number = scanner.next();
                // 判断用户输入验证码和系统随机验证码是否匹配
                if (number.equalsIgnoreCase(verification)){
                    break;
                }else {
                    System.out.println("验证码错误，请重新输入");
                }
            }
            // 3.验证用户名和密码是否正确
            User userInfo = new User(username,password,null,null);
            boolean result = checkUserInfo(list,userInfo);
            if (result){
                System.out.println("登录成功");
                StudentSystem stu = new StudentSystem();
                stu.startStudentSystem();
                break;
            }else {

                if (i==2){
                    System.out.println("当前用户" + username +"以被锁定，请联系管理员！");
                    return;
                }else {
                    System.out.println("用户名或密码错误，还剩下" + (2-i) + "次机会");
                }
            }
        }
    }

    // 判断用户名或密码是否正确
    private static boolean checkUserInfo(ArrayList<User> list,User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            // 得到集合里面每个用户对象
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())){
                return true;
            }
        }
        return false;
    }

    // Register注册方法
    private static void register(ArrayList<User> list) {
        // 1.校验用户名是否合法
        Scanner scanner = new Scanner(System.in);
        String username;   // 用户名
        String password;   // 密码
        String personId;   // 身份证号
        String phoneNumber;// 手机号
        while (true) {
            System.out.print("请输入用户名:");
            username = scanner.next();
            boolean exists = checkUserName(username);
            if (!exists) {
                System.out.println("用户名不合法,请重新输入");
                continue;
            }
            // 2.用户名唯一(判断用户名是否在集合当中存在)
            boolean flag = contains(list, username);
            if (flag) {
                System.out.println("用户名" + username + "已经存在，请重新输入");
            } else {
                break;
            }
        }
        // 3.密码键盘输入两次，两次一致才可以进行注册
        while (true) {
            System.out.print("请输入密码:");
            password = scanner.next();
            System.out.print("请确认密码:");
            String againpassword = scanner.next();
            if (!password.equals(againpassword)) {
                System.out.println("两次密码不一至，请重新输入");
            } else {
                break;
            }
        }
        // 4.录入身份证
        while (true) {
            System.out.print("请输入身份号：");
            personId = scanner.next();
            boolean flage2 = checkPersonID(personId);
            if (flage2) {
                break;
            } else {
                System.out.println("身份证号格式有误，请重新输入");
            }
        }
        // 5.手机号码
        while (true) {
            System.out.print("请输入手机号码:");
            phoneNumber = scanner.next();
            boolean flag3 = getPhoneNumber(phoneNumber);
            if (flag3) {
                break;
            } else {
                System.out.println("手机号码格式有误，请重新录入");
            }
        }
        // 6.将用户名、密码、身份证、手机号存入到User对象中
        User user = new User(username,password,personId,phoneNumber);
        // 7.将用户对象存入集合当中
        list.add(user);
        System.out.println("注册成功");
        // 8.遍历集合
        printlist(list);
    }

    // 遍历集合方法
    private static void printlist(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "--" + user.getPassword() + "--"+user.getCord() + "--"+user.getPhonenumber());
        }
    }

    // forgetPassword忘记密码方法
    private static void forgetPassword(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        // 1.判断用户是否存在
        System.out.print("请输入用户名:");
        String username = scanner.next();
        boolean flag = contains(list, username);
        if (!flag){
            System.out.println("用户名" + username + "不存在，请先注册");
            return;
        }
        // 2.键盘录入身份证号码和手机号码
        System.out.print("请输入身份证号：");
        String personId = scanner.next();
        System.out.print("请输入手机号码");
        String phoneNumber = scanner.next();
        // 3.判断用户的身份证和手机号是否一致
        int index = findIndex(list,username);
        User user = list.get(index);
        if (!(user.getPassword().equalsIgnoreCase(personId) && user.getPhonenumber().equals(phoneNumber))){
            System.out.println("身份证号码或者密码错误，不能修改密码");
        }
        // 4.执行到这里说明用户名存在且身份证号和密码正确，在执行修改密码的操作
        String password;
        while (true) {
            System.out.print("请输入新的密码：");
            password = scanner.next();
            System.out.print("请确认你的新密码：");
            String agianPassword = scanner.next();
            if (password.equals(agianPassword)){
                System.out.println("两次输入的密码相同，注册成功");
                break;
            }else {
                System.out.println("两次输入的密码不同，请再次输入");
            }
        }
        user.setPassword(password);
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个用户对象
            User user = list.get(i);
                if (user.getUsername().equals(username)){
                    return i;
                }
        }
        return -1;
    }

    // 判断用户名是否合法
    private static boolean checkUserName(String username) {
        // 1.判断输入的长度是否合法
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("您输入的长度不合法,请重新输入");
            return false;
        }
        // 2.判断只能是字母加数字的组合
        // 遍历字符串
        // 不能是纯数字，
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            // 得到字符串里面的每个字符
            char c = username.charAt(i);
            // 判断字符是字母加数字的组合。但是不能是纯数字
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
            if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                count++;
            }
        }
        return count > 0;
    }

    // 用户名是否唯一方法
    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uid = user.getUsername();
            if (uid.equals(username)) {
                return true;
            }
        }
        return false;
    }

    // 身份证判断方法
    private static boolean checkPersonID(String personId) {
        // 1.如果输入的身份证号长度不够18直接返回false
        if (personId.length() != 18) {
            System.out.println("号码不够18位");
            return false;
        }
        // 2.如果是以0开头，直接返回false
        if (personId.startsWith("0")) {
            System.out.println("身份证不能以0开始");
            return false;
        }
        // 3.前17位必须都是数字
        for (int i = 0; i < personId.length() - 1; i++) {
            char c = personId.charAt(i);
            if (!(c >= '0' && c <= 9)) {
                return true;
            }
        }
        // 4.最后一位可以是数字，也可以是大写X或小写x
        char c = personId.charAt(personId.length() - 1);
        if ((c >= '0' && c <= '9') || (c == 'x') || (c == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    // 手机号码验证方法
    private static boolean getPhoneNumber(String phoneNumber) {
        // 1.如果手机号长度不够11位，直接返回false
        if (phoneNumber.length() != 11) {
            return false;
        }
        // 2.不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        // 3.必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    // 随机生成一个验证码
    private static String getVerification(){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        // 随机抽取4个字符
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char c = list.get(index);
            // 将随机抽取的四个字符添加到StringBuilder中
            sb.append(c);
        }
        // 将随机数字拼接到4个字符后边
        int number = random.nextInt(10);
        sb.append(number);
        // 将字符串变成数组，在数组当中修改，最后在创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        // 最后一个索引跟随机索引进行交换
        int randomIndex = random.nextInt(sb.length());
        // 最大索引指向的元素 跟随机索引的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length -1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }
}

