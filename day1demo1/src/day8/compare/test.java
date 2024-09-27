package day8.compare;

import java.util.Comparator;
import java.util.TreeSet;
//比较器排序,注意规则里只比较age的话,age一样的不会存储,因为返回值为0 默认一样.
class Person {
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
    }}

public class test {
    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        people.add(new Person("zs",21));
        people.add(new Person("zs",25));
        people.add(new Person("ls",22));
        people.add(new Person("ls",44));
        people.add(new Person("2",28));
        System.out.println(people);

    };
    }
