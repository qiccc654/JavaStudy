package day4T;

public class T3 {
    public static void main(String[] args) {
        int[] ints = {3,1, 5, 4, 8};
        int biger= ints[0]>ints[1]?ints[0]:ints[1];
        int big =ints[0]<ints[1]?ints[0]:ints[1];
        for (int i = 2; i < ints.length; i++) {
            if (ints[i]>big){
                big=ints[i];
                if (big>biger){
                    big=big^biger;
                    biger=big^biger;
                    big=big^biger;
                }
            }
        }
        System.out.println(big);
        System.out.println(biger);
    }
}
