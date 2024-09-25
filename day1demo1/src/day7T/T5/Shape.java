package day7T.T5;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double area();
    public String getColor(){
        return this.color;
    }
}
