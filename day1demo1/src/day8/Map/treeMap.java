package day8.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class treeMap {
    public static void main(String[] args) {
        
        TreeMap<Student, String> studentStringTreeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}
