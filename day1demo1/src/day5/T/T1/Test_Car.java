package day5.T.T1;

public class Test_Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="五菱";
        car.color="black";
        car.price=100;
        System.out.println(car.toString());
        car.go();


    }
}
