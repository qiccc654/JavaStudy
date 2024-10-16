package day11_T;

import java.io.*;
import java.util.ArrayList;

/*
* 11.编写两个方法，分别实现如下功能：
A) save()方法：创建三个Person类型对象，将它们使用序列化手段写入本地文件中持久化存储
B) load()方法：将save()方法中保存的Person对象读取出来，打印输出属性
* */
public class T11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("w",11));
        person.add(new Person("z",44));
        person.add(new Person("g",65));
        //save(person);
        load();
    }
    public static void save(ArrayList<Person> person) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        oos.writeObject(person);
        oos.close();
    }
    public static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }

}
