package day4T;

import java.util.Arrays;

public class T10_3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 3, 4, 1, 3};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            if (min!=i){
                arr[min]=arr[min]^arr[i];
                arr[i]=arr[min]^arr[i];
                arr[min]=arr[min]^arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
