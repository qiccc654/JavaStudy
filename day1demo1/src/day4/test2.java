package day4;

import java.util.Arrays;
/*冒泡排序*/
public class test2 {
    public static void main(String[] args) {
        int [] arr ={1,4,3,5,3,4,9,4,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]<arr[j+1]){
                    int a =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
