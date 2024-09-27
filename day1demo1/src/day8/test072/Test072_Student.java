package day8.test072;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/*
* 不重写equals方法和hashcode方法使用hashset
* 重复存入多个相同数据,不重写默认返回哈希值为地址值*/
class student {
    private String name;
    private int age;
    public student() {}
    public student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age
                + "]";
    }
}
public class Test072_Student {
    public static void main(String[] args) {
        //1.实例化HashSet对象
        Set<student> set = new HashSet<>();
        //2.往集合中添加元素
        student s1 = new student("zs",20);
        student s2 = new student("zs",20);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        set.add(s1);
        set.add(s2);
        set.add(new student("zs",20));
        set.add(new student("zs",20));
        System.out.println("size: " + set.size());
        //3.遍历
        for (student stu : set) {
            System.out.println(stu);
        }

    }
}
