package day7T.T6;

public class Dog extends Animal{
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("汪汪叫");
    }

    @Override
    void move() {
        System.out.println("狗奔跑");
    }
}
