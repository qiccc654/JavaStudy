package day8.treeSet;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable{
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
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
    public String toString() {
        return "Person [name=" + name + ", age=" + age
                + "]";
    }


    @Override
    public int compareTo(Object o) {
        Person i = (Person) o;
        int r = name.compareTo(i.name);
        if (r==0){
            r = this.age -i.age;
        }
        return r ;
    }
}
public class treeSetTest {
    public static void main(String[] args) {
//1.实例化TreeSet
        Set<Person> set = new TreeSet<>();
        //2.添加元素
        set.add(new Person("zs",21));
        set.add(new Person("zs",25));
        set.add(new Person("ls",20));
        set.add(new Person("tom",19));
        //3.遍历集合
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
