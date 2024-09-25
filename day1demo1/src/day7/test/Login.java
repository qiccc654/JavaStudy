package day7.test;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String admin = sc.nextLine();
        System.out.println("输入密码");
        String passwd = sc.nextLine();
        if("admin".equals(admin)
                && "briup".equals(passwd)) {
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败，用户名或密码错误！");
        }

    }
}
