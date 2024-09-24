package day4T;

import java.util.Arrays;

/*插入排序*/
public class T10_2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 3, 4, 1, 3};
        insert(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static int[] insert(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i-1;
            for (; j >=0 ; j--) {
            if (value<arr[j]){
                arr[j+1]=arr[j];
            }else {
                break;
            }
            }
            arr[j+1]=value;
        }
        return arr;
    }
}
