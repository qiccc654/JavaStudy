package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        //准备学生对象，注意s1和s5两个对象的属性一模一样
        Student s1 = new Student("zs",20);
        Student s2 = new Student("ls",19);
        Student s3 = new Student("ww",22);
        Student s4 = new Student("tom",18);
        Student s5 = new Student("zs",20);
        //1.定义只能存储Student对象的集合
        Collection<Student> coll = new ArrayList<>();
//2.往集合中添加元素
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        coll.add(s4);
        System.out.println("-----------foreach");
        for (Student student : coll) {
            System.out.println(student);
        }
        System.out.println("--------------iterator");
        Iterator<Student> iterator = coll.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------------size");
        //3.输出集合元素个数，输出集合对象
        System.out.println("coll.size: " +
                coll.size());
        System.out.println("coll: " + coll);
        System.out.println("------------");
        //4.判断s5是否存在
        boolean flag = coll.contains(s5);
        System.out.println("contains(s5): " + flag);
        //5.删除s5
        //通过equals比较不重写的话不会删除s1,s1与s5参数一样
        flag = coll.remove(s5);
        System.out.println("remove(s5): " + flag);
        System.out.println("coll.size: " +
                coll.size());
        System.out.println("coll: " + coll);
    }
}
