package day3_5;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*判断是否闰年 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();
        if((year % 4 ==0 && year % 100 !=0)||(year % 400==0) ){
            System.out.println("是闰年");

        }else {
            System.out.println("不是闰年");
        }
    }
}
