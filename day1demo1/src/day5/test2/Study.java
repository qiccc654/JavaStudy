package day5.test2;

public class Study {
    private String name;
    private double age;
    public Study(){
        System.out.println("_________________--");
    }

    public Study(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
