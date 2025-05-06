package com.studentCode;

import java.util.ArrayList;
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
        System.out.println("欢迎来到学生管理系统");
        System.out.print("请选择操作：1登录 2注册 3忘记密码:");

        Scanner scanner = new Scanner(System.in);
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

    // login登录方法
    public static void login(ArrayList<User> list) {

    }

    // Register注册方法
    public static void register(ArrayList<User> list) {
        // 1.校验用户名是否合法
        Scanner scanner = new Scanner(System.in);
        String username = "";   // 用户名
        String password = "";   // 密码
        String personId = "";   // 身份证号
        String phoneNumber = "";// 手机号
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
                continue;
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
                continue;
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
    }

    // forgetPassword忘记密码方法
    public static void forgetPassword(ArrayList<User> list) {

    }

    // 判断用户名是否合法
    public static boolean checkUserName(String username) {
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
    public static boolean contains(ArrayList<User> list, String username) {
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
    public static boolean checkPersonID(String personId) {
        // 1.如果输入的身份证号长度不够18直接返回false
        if (personId.length() != 18) {
            return false;
        }
        // 2.如果是以0开头，直接返回false
        if (personId.startsWith("0")) {
            return false;
        }
        // 3.前17位必须都是数字
        for (int i = 0; i < personId.length() - 1; i++) {
            char c = personId.charAt(i);
            if (!(c >= '0' && c <= 9)) {
                return false;
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
    public static boolean getPhoneNumber(String phoneNumber) {
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
}

