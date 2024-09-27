package day8_T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.addAll(Arrays.asList("1"+"2"));
        Object[] array = str.toArray();
        System.out.println("-----------fori");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------foreach");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("----------iterator");
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
