package day5.T.T10;

public class Teacher {
    private String name;
    private int age;
    private String gender= "男";


    public String show() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void disp(){
        this.name = "jack";
        this.age = 18;
        System.out.println("this.age:"+this.age);
        System.out.println("this.name:"+this.name);
        System.out.println("this.gender:"+this.gender);

    }
}
