package day3_5;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {

       // double v =  (Math.random() * (20 - 10 + 1));
        Random random = new Random();
        int i ;
        while (true){
             i = (int) ((Math.random() *(20 - 10 +1)) +10);
            System.out.println( i);
            //System.out.println((int)(Math.random() *(20 - 10 +1)) +10);
        }

    }
}
