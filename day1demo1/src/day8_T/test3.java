package day8_T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Integer > list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer > list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(4, 5, 6));
        System.out.println(list);
        System.out.println(list1);
        ArrayList<Integer> newlist = new ArrayList<>();/* list.retainAll(list1);
        System.out.println(list);*//*list.removeAll(list1);
        System.out.println(list);*/
        for (Integer i : list) {
            if (list1.contains(i)){
                newlist.add(i);
            }
        }
        System.out.println(newlist);
        System.out.println(list);
    }
}
