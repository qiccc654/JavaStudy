package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //1.实例化Set集合，指向HashSet实现类对象
        Set<String> set = new HashSet<>();
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        set.add("hello4");
        boolean flag = set.add("hello5");
        System.out.println("第1次添加hello5: " + flag);
        flag = set.add("hello5");   //添加失败 重复元素
        System.out.println("第2次添加hello5: " + flag);
        System.out.println("---------------");
        //加强for循环遍历
        for(String obj : set){
            System.out.println(obj);
        }
        System.out.println("-----------------");
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
