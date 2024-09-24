package day3;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<=15){
            System.out.print(a+"=");
            for (int i = 2; i <=a ; i++) {
                while (a % i == 0){
                    a= a / i;
                    System.out.print(i);
                    if (a!=1) {
                        System.out.print( " *");
                    }

                }
            }
        }else System.out.println("错误");



    }

}
