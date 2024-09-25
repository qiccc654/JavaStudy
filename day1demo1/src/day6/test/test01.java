package day6.test;


class Student {
   private String name;
   private String brand;
   private int age;

    public Student(){   }
    public Student(String name, String brand, int age) {
        this.name = name;
        this.brand = brand;
        this.age = age;
    }

   public String getName(){
        return name;
   }
   public void setName(String name){
        this.name=name;
   }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class test01 {
    public static void main(String[] args) {
        Student student = new Student("wz", "nan", 11);
        Student student1 = new Student();


    }
    }

