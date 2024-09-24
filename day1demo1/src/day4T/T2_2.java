package day4T;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T2_2 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ints[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
        }

    }

