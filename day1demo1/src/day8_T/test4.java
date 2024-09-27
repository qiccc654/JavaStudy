package day8_T;

import java.util.ArrayList;
import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
           list.add(r.nextInt(19)+1) ;
          // list.add((int) (Math.random()*20)) ;
        }

        System.out.println(list);
        System.out.println(list.size());
        for (Integer i : list) {
            if (i%2==0 && i !=0){
                list1.add(i);
            }
        }
        System.out.println(list1);
    }
}
