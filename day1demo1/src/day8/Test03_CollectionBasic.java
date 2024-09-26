package day8;

import java.util.ArrayList;
import java.util.Collection;

public class Test03_CollectionBasic {
    // 集合中 一般 也放 同一种类型数据
// contains remove
    public static void main(String[] args) {
        // 1.接口 引用 = new 实现类(实参);
        // 暂时可把它当成固定写法
        Collection coll = new ArrayList();
        if (coll.isEmpty())
            System.out.println("coll is Empty!");
        // 2.任何引用类型都可以放入
// 自动扩容
        coll.add("hello");  //String
        Integer i = 12;
        coll.add(i);
        coll.add(2.3);
        coll.add(1.2F);
        coll.add('a');
// Double
        // Float
        // Character
        int[] arr = { 1, 2, 3 };
        coll.add(arr);
//int[]
        // coll.add(new Student());
        // 3.输出 coll.toString()
        System.out.println(coll);
        System.out.println("size: " + coll.size());
        System.out.println("--------------");
        // 4.清空 coll
        coll.clear();
        System.out.println(coll);
        // 5.判断是否为空
        if (coll.isEmpty())
            System.out.println("coll is Empty!");
        else
            System.out.println("coll is not empty!");
    }
}
