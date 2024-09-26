package day8;

import java.util.ArrayList;
import java.util.Collection;

public class Test03_Element {
    public static void main(String[] args) {
        //1.实例化两个集合对象，专门存放String类型元素
        // 集合实例化对象 固定写法
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        //2.分别往c1和c2集合中添加元素
        String s1 = "hello";
        String s2 = "world";
        c1.add(s1);
        c1.add(s2);
        String s3 = "nihao";
        String s4 = "hello";
        String s5 = "okok";
        c2.add(s3);
        c2.add(s4);
        c2.add(s5);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("-------------");
        //3.将c2集合整体添加到c1中
        c1.addAll(c2);
        System.out.println("c1.size: " + c1.size());
        System.out.println("after addAll(c2), c1: " +
                c1);
        //量池中
        System.out.println("-------------");
        //4.判断是否包含指定元素
        boolean f = c1.contains("hello");
        System.out.println("contains hello: " + f);
        //5.创建s6对象，判断集合中是否包含该对象
        //  注意: s6的地址 和 "world"地址不一样
        //  s6是堆中临时new出来的，"world"存在堆中的字符串常
        String s6 = new String("world");
        // 结果显示true，说明集合contains方法借助equals方法进行比较，而非 ==
        //自定义类是使用contains方法需要重写类中equals方法
        f = c1.contains(s6);
        System.out.println("contains(s6): " + f);
        System.out.println("-------------");
        //6.判断是否包含c2对象
        f = c1.containsAll(c2);
        System.out.println("containsAll(c2): " + f);
        System.out.println("-------------");
        //7.删除指定元素【底层借助equals比较，然后删除】不是直接比较地址
        f = c1.remove(s6);
        System.out.println("remove(s6): " + f);
        System.out.println("after remove, c1: " + c1);
        System.out.println("-------------");
        //8.删除c2整个集合【底层实现：遍历c2，逐个元素equals比较，然后删除】
        f = c1.removeAll(c2);
        System.out.println("removeAll(c2): " + f);
        System.out.println("after remove, c1: " + c1);
    }
}
