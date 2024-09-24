package day6_T.T22;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // 表面积 = 2 * 圆面积 + 圆周长 * 高
        return 2 * super.calculateArea() + super.calculatePerimeter() * height;

    }

    public double calculateVolume() {
        // 体积 = 圆面积 * 高
        return super.calculateArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + getRadius() + " and height: " + height;
    }
}
