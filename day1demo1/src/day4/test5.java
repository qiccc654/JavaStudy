package day4;

import java.util.ArrayList;
import java.util.Arrays;

/*可变参数*/
public class test5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(test1(1, 2, 3)));
        System.out.println(Arrays.toString(test1(1, 2, 3,4,33,2,56,7,1)));
        System.out.println(test(1, 2, 3, 4));
        System.out.println(test(1, 2, 3, 4,3,2,4,5,6,2));
        System.out.println(test(1.0,1, 2, 3, 4,3,2,4,5,6,2));
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        for (Integer i : list) {
            System.out.println(i);
        }*/

    }
    public static int test(int a){
        return a;
    }
    public static int test(int a,double b){
        return a;
    }
    public static double test(double b,int ... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return b;
    }
    public static int test(int ... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int[] test1(int ... a){

        return a;
    }
}
