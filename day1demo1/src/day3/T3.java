package day3;

public class T3 {
    public static void main(String[] args) {
        int a = 7;
        int i = setBit0(a, 2);
        System.out.println(i);
        System.out.println(setBit1(i, 2));

    }
    public static int setBit1(int value,int n){
        int a =value | (1<<(n-1));
        return a;
    }
    public static int setBit0(int value,int n){
        int a = value & ~(1<<(n-1));
        return a;
    }
}
