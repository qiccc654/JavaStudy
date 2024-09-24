package day3;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("冬天");
                 break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("春");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("夏");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("秋");
                break;
            default:
                System.out.println("输入cuowu");
        }

    }
}
