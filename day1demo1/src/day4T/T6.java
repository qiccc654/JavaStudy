package day4T;

import java.util.Random;

public class T6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            System.out.println((int) (random*100+1));
        }

    }
}
