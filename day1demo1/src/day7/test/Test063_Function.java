package day7.test;

import java.util.Scanner;

public class Test063_Function {
    public static void main(String[] args) {
        //1.实例化sc对象，获取从键盘录入整行字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String str = sc.nextLine();
//2.获取字符串长度 及 索引2上的字符
        System.out.println("length: " + str.length());
        System.out.println("charAt(2): " + str.charAt(2));
        //3.统计字符串中数字字符的个数
        char[] array = str.toCharArray();
        int count = 0;
        //加强for循环，格式：
//  for (数据类型 变量名 : 数组或集合) {  }
        for (char c : array) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        System.out.println("数字字符个数: " + count);
    }
}