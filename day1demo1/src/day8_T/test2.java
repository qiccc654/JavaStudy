package day8_T;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Tom");
        list.add("Jack");
        list.add("jerry");
        list.add("Alice");
        System.out.println("-------------");
        HashSet<String> str = new HashSet<>(list);
        list.clear();
        list.addAll(str);
        System.out.println(list);
        for (String s : str) {
            System.out.println(s);
        }


    }
}
