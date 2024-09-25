package day7T.T6;

public class Cat extends Animal {

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("喵喵");
    }

    @Override
    void move() {
        System.out.println("猫爬行");
    }
}
