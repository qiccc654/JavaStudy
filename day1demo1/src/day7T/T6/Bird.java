package day7T.T6;

public class Bird extends Animal {
    private double wingSpan;

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    @Override
    void makeSound() {
        System.out.println("啾啾");
    }

    @Override
    void move() {
        System.out.println("飞翔");
    }
}
