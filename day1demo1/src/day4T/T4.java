package day4T;

public class T4 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3};
        for (int num : ints) {
            System.out.println(num);
            num=4;
            System.out.println(num);
        }
        System.out.println(ints[0]);
    }
}
