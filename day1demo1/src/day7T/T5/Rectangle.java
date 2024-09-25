package day7T.T5;

public class Rectangle extends Shape{
    private int lengh;
    private int high;

    public Rectangle(String color, int lengh, int high) {
        super(color);
        this.lengh = lengh;
        this.high = high;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    double area() {
        return high*lengh;
    }
}
