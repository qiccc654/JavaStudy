package day4T;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 =arr1;
        arr2[1]=0;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
