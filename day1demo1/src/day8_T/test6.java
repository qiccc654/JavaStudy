package day8_T;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//排序,奇数在前,偶数在后,奇数升序,偶数降序
public class test6 {
    public static void main(String[] args) {
      Comparator com =  new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 % 2 ==1){
                    return o1 -o2;
                }else {
                    return o2 -o1;
                }
            }
        };

        Set<Integer> set = new TreeSet<>(com);
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println(set);

    }

}
