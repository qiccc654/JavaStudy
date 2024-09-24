package day5.T.T1;

public class Car {
    String color;
    String brand;
    int price;

    public  void go(){
        System.out.println("前进");
    }
    public  void down(){
        System.out.println("后退");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public Car(){
        System.out.println("car无参");
    }
}
