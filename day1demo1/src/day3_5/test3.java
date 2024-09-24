package day3_5;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入整数 [0,6]: ");
        int day = sc.nextInt();
        String msg = null;
        switch(day){
            case 0:
                msg = "星期天";
                break;
            case 1:
                msg = "星期一";
                break;
            case 2:
                msg = "星期二";
                break;
            case 3:
                msg = "星期三";
                System.out.println(3);
                break;
            case 4:
                msg = "星期四";
                System.out.println(4);
                break;
            case 5:
                msg = "星期五";
                System.out.println(5);
                break;
            case 6:
                msg = "星期六";
                System.out.println(6);
                break;
            default:
                msg = "参数有误，参数day的值可以在[0,6]之间";
        }
        System.out.println(msg);
    }
}
