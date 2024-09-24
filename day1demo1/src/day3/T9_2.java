package day3;

import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

/*计算第几天*/
public class T9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 0;
        int year =sc.nextInt();
        int mo =sc.nextInt();
        int day =sc.nextInt();
        switch (mo){
            case 4:
                days+=31;
            case 3:
                if((year%4==0&&year%100!=0)||year%400==0){
                    days+=29;
                }else days+=28;
            case 2:
                days+=31;
            case 1 :
                days+=days;


        }
        System.out.println(days);
    }
}
