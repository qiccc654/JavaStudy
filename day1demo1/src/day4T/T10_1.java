package day4T;
/*冒泡排序*/
import java.util.Arrays;

public class T10_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 3, 4, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
               if (arr[j]> arr[j+1]){
                   arr[j]= arr[j]^ arr[j+1];
                   arr[j+1]= arr[j]^ arr[j+1];
                   arr[j]= arr[j]^ arr[j+1];
               }


            }

        }
    }
}
