package day4;
/*二维数组初始化*/
public class test6 {
    public static void main(String[] args) {
        int[][] ints = new int[3][];
        int[] ints2 = {1, 2, 1,8,2};
        int[] ints3 = {3,2,9,1, 2, 7};
        //完整格式
        ints[0]=new int[]{1,2,3};
        //存数组进去
        ints[1]=ints2;
        ints[2]=ints3;
        //花括号简化格式
        int[][] arry={{1,2},{1,2,3,4},{1,2,3}};
        //

        System.out.println(ints[2][5]);
        System.out.println(ints[1].length);
    }
}
