package day4T;

import java.util.Arrays;

public class T10_insertSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 5, 2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for ( ; j >=0; j--) {
                if (value<arr[j]){
                    arr[j+1]=arr[j];
                }else break;
            }
            arr[j+1]=value;
        }

        return arr;
    }
}
