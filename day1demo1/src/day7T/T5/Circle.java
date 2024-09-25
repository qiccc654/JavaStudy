package day7T.T5;

public class Circle extends Shape{
    private double radius;



    @Override
    double area() {
        return radius*radius*Math.PI;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
