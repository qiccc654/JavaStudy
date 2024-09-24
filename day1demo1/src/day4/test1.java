package day4;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,5,6};
        int[] arr1 = new int[]{4,2,26,6,1,8,7};
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/


        int[] ints = Arrays.copyOf(arr1, 10);
        System.out.println((Arrays.toString(ints)));;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //test();

    }

    private static void test() {
        double[] arr1 = new double[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            System.out.println(arr1);
        }

        double[] chars = new double[5];
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
