package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //1.创建List集合对象
        List<String> list = new ArrayList<>();
        //2.添加元素，默认尾部添加
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello1");
        System.out.println(list);
        //3.指定位置添加元素
        // add(int index,String s)
        //添加元素元素后移不删除
        System.out.println("-------------add");
        list.add(1, "world");
        System.out.println(list);
        System.out.println("-----------");
        //3.删除索引位置为2的元素
        /*String msg = list.remove(2);
        System.out.println("remove(2): " + msg);
        System.out.println("after remove: " + list);*/
        //4.修改指定位置元素
        System.out.println("-----------set");
        list.set(0, "briup");
        System.out.println(list);
        //5.借助get方法遍历集合
        System.out.println("----------get i");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");
//6.使用foreach遍历
        System.out.println("--------------foreach");
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println("-----------------");
        //7.使用迭代器遍历
        System.out.println("-----------iterator");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
