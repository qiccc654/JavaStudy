package day8.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        //2.往集合中添加元素
        // map中插入键值对，调用key所属类的hashCode和equals方法进行判断是否重复
        map.put(new Student("zs", 78), "010");
        map.put(new Student("rose", 82), "005");
        map.put(new Student("lucy", 70), "009");
        map.put(new Student("lucy", 70), "019");
        //相同key，只能保留一项，"019"会覆盖"009"
        map.put(new Student("ww", 67), "002");
        //注意：HashMap中key和value都可以为null
        map.put(new Student("tom", 86), null);
        map.put(null, "002");
        //3.基本方法测试
// 获取长度
        System.out.println("size: " + map.size());
        // 判断key是否存在
//  借助 key所属类的hashCode和equals方法完成
        System.out.println("Student(ww,67)是否存在: " +
                map.containsKey(new Student("ww", 67)));
        // 判断value是否存在
//  借助value所属类型的 equals方法
        System.out.println("是否存在 009: " +
                map.containsValue("009"));
        // 根据key删除，返回键对应的值
        String value = map.remove(new Student("lucy",
                70));
        System.out.println("remove(Student(lucy, 70)): " + value);
        System.out.println("---------------遍历一");
// 4.第一种遍历方法
        Set<Student> students = map.keySet();
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------");
        // 第二种方式遍历
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
