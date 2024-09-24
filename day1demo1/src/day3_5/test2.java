package day3_5;

import java.util.Scanner;

public class test2 {
           /*从键盘录入一个hour值，如果录入的是8~12之间的值，那么就输出早上好，如果是12点~14点，则输出
            中午好，如果是14点~18点，则输出下午好，其他情况，输出晚上好*/
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input a hour: ");
            int hour = sc.nextInt();
            String message = null ;
            if (hour >= 8 && hour < 12) {
                message = "早上好";
            } else if (hour >= 12 && hour < 14) {
                message = "中午好";
            } else if (hour >= 14 && hour < 18) {
                message = "下午好";
            } else if (hour >=18 && hour <= 24){
                message = "晚上好";
            }else
                message = "cuow";
            System.out.println(message);
        }
    }

