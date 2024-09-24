package day4;
/*杨辉三角*/
public class test4 {
    public static void main(String[] args) {
        int len =9;
        int[][] ints = new int[len][len];
        main(len, ints);
        print(len, ints);

    }

    private static void print(int len, int[][] ints) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < ints.length-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ints[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void main(int len, int[][] ints) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <=i; j++) {
                if (j==0){
                    ints[i][j]=1;
                }
                else if (i==j){
                    ints[i][j]=1;
                }else {
                    ints[i][j]= ints[i-1][j]+ ints[i-1][j-1];
                }
            }
        }
    }
}
