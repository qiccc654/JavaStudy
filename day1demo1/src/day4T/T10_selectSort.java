package day4T;

import java.util.Arrays;

public class T10_selectSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8, 2, 6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j ;
                }
            }
            if (min!=i){
                arr[min]=arr[min]^arr[i];
                arr[i]=arr[min]^arr[i];
                arr[min]=arr[min]^arr[i];
            }

        }


        return arr;
    }
}
