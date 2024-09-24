package day5.T.T8;

public class Person {
    String name;
    String age;
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public  Person (String name){
        this(name,"0");
    }

    public String show() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
