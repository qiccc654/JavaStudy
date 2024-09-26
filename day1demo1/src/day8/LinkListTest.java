package day8;

import java.util.LinkedList;

public class LinkListTest {
    public static void main(String[] args) {
        //1.实例化集合对象
//注意，要测试LinkedList中的方法，必须用LinkedList引用指向LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        String s1 = "hello";
        String s2 = "world";
        String s3 = "ni hao";
        //2.往集合中添加元素并输出
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("list: " + list);
        System.out.println("------------");
        //3.往头、尾节点添加元素
        list.addFirst("first");
        list.addLast("last");
        System.out.println("list: " + list);
        System.out.println("------------");
        //4.获取头尾节点元素
        System.out.println("getFirst: " +
                list.getFirst());
        System.out.println("getLast: " +
                list.getLast());
        System.out.println("------------");
        //5.删除头尾节点元素
        list.removeFirst();
        list.removeLast();
        System.out.println("list: " + list);
    }
}

