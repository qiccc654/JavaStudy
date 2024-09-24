package day4;

import sun.security.util.Length;

import java.util.Arrays;
/*数组copy方法*/

public class test3 {
    public static void main(String[] args) {
        int[] i ={1,2,3,4,5,6};
        int[] ints1 = Arrays.copyOf(i, 6);
        for (int i1 : ints1) {
            System.out.println(i1);
        }
        int[] a = extend(i);
        int b =1;
        int[][] ints = new int[3][5];
        ints[2] =i;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 5; k++) {
                ints[j][k]=b;
                b++;
            }
        }
        System.out.println(ints[2][3]);
        for (int[] anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(a));

    }
    public static int[] extend (int[] i){
        int[] a = new int[i.length * 2];
        System.arraycopy(i,0,a,0, i.length);
        System.arraycopy(i,0,a,6, i.length);
        System.arraycopy(i,0,a,2, 3);

        return a;

    }
}
