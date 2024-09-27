package day8_T;

import java.util.HashSet;
import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();
        for (; set.size() < 10; ) {
            set.add(r.nextInt(20)+1);
        }
        System.out.println(set);
        System.out.println(set.size());

    }
}
