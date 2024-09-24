package day5.test1;

public class Student {
    int age;
    String name;
    String a = "sdcscz";
    public void sp(){
        speak();
    }
    private void speak(){
        String a = "sdcscz";
        System.out.println("hello  "+a);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
