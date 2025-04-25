package com.String;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        /*
        已知正确的用户名和密码，请用程序实现模拟用户登录
        总共给三次机会，登录之后，给出相应的提示
        */
        String username = "张三";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名:");
            String name = scanner.next();
            System.out.print("请输入密码:");
            String pwd = scanner.next();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else if (i == 2) {
                System.out.println("输入次数已经超过3次，账户已经锁定");
                break;
            } else {
                System.out.println("登录失败，用户名或密码错误，您还剩" + (2 - i) + "次机会");
            }
        }
    }
}