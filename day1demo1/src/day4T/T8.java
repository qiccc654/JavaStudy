package day4T;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int i1 = r.nextInt(10)  + 1;
            arr[i]=i1;
        }
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        while (true){
            int a =sc.nextInt();
            if (a== -1){
                break;
            }else {
                boolean b = false;
                for (int i = 0; i < 20; i++) {
                    if (a==arr[i]){
                        System.out.println(arr[i]);
                        System.out.println(i);
                        b= true;
                    }
                }
                if (!b){
                    System.out.println("错误");
                }
            }
        }
    }
}
