package day3;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*5    0101
        * 9    1001
        * 1    0001
        */
        System.out.println(5&9);
        /*5     0101
        * 9     1001
        * 13    1101
        * */
        System.out.println(5|9);
        /*5   0101
        * 9   1001
        * 12  1100
        * */
        System.out.println(5^9);
        /*5 1 0(23) 0101
        *反 1 1(23) 1010
        * 补1 1(23) 1011
        * fan 0100
        * */
        System.out.println(~-5);
        /* 5   0101
        * 16 1 0100
        * */
        System.out.println(5<<2);
        /*5 1 0(23) 0101
         *反 1 1(23) 1010
         * 补1 1(23) 1011
         * 移  1   10 1100
         *反   1   10 1011
         *原   1   01 0100
         *          * */
        System.out.println(-5<<2);
        /*5 1 0(23) 0101
         *反 1 1(23) 1010
         * 补1 1(23) 1011
         *yi 1 1(23) 1110
         * 反 1 1(23) 1101
         * 原 1 0(23) 0010
         * */
        System.out.println(-5>>2);
        /*5 1 0(23) 0101
         *反 1 1(23) 1010
         * 补1 1(23) 1011
         *yi 001 1(23) 11
         * */
        System.out.println(-5>>>2);
        System.out.println(0b00111111111111111111111111111111);
        /*5 0 0(23) 0101
         *yi 0 0(23) 0001
                  * */
        System.out.println(5>>2);
        /*超过32位取余数*/
        System.out.println(5>>34);
        /*ask码表*/
        System.out.println(97=='a');
        /**/
        System.out.println(5==5.0);
        System.out.println(4>5 ^ 'c'>'a');
        System.out.println((int) (short)(byte)-1);


    }
}
