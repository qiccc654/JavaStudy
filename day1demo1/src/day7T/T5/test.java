package day7T.T5;

public class test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red",2,3);
        Shape circle = new Circle("blue", 5);
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.area());
        System.out.println("-----------");
        System.out.println(circle.getColor());
        System.out.println(circle.area());


    }
}
