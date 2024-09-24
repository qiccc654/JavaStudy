package day3;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int v =sc.nextInt();
        System.out.println("b");
        int n =sc.nextInt();

        if((v % 3 == 0) && (v % 5 == 0)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        System.out.println("--------------");
        //判断是否 是3的整数倍 或 是5的整数倍
        // 注意：使用 | 效果也一样
        if((n % 3 == 0) || (n % 5 == 0)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
