package day8_T.T10;

import java.util.Comparator;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        /*TreeSet<Teacher> T = new TreeSet<>();
        T.add(new Teacher(1,23,"zs"));
        T.add(new Teacher(2,20,"ls"));
        T.add(new Teacher(3,26,"ww"));
        T.add(new Teacher(4,55,"ww"));
        T.add(new Teacher(5,11,"ww"));
        System.out.println(T);*/
        TreeSet<Teacher> t = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int r = o1.getName().compareTo(o2.getName());
                if (r == 0) {
                    r = o1.getAge()-o2.getAge();
                    if (r == 0) {
                        r = o1.getId()-o2.getId();
                    }
                }
                return r;
            }
        });
        t.add(new Teacher(1,23,"zs"));
        t.add(new Teacher(2,20,"ls"));
        t.add(new Teacher(3,26,"ww"));
        t.add(new Teacher(4,55,"ww"));
        t.add(new Teacher(5,11,"ww"));
        System.out.println(t);

    }
}
