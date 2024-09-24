package day4T;

public class T7 {
    public static void main(String[] args) {
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        for (int i = 0; i < 4; i++) {
            int a = (int) (Math.random()*67+1+65);
            System.out.println(a);
            if (a>122){
              int b = a - 122;
                System.out.println(b);

            }else {
                System.out.println((char) a);
            }
        }

    }
}