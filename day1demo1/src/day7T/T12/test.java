package day7T.T12;
interface flayAction {
    public abstract void fly();
}
class bird implements flayAction{

    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }
}
class plane implements flayAction{

    @Override
    public void fly() {
        System.out.println("飞机会飞");
    }
}
public class test {
    public static void main(String[] args) {
        flayAction bird = new bird();
        flayAction plane = new plane();
        bird.fly();
        plane.fly();
    }
}
