package day4T;

import java.util.Arrays;
import java.util.Random;

public class T9 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            int i1 = r.nextInt(6) + 1;
            arr1[i]=i1;
            arr[i1-1]++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
