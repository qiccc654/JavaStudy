package day7T.T13;

public class Student extends Person implements IFlyAble,ISingAble{
    private int id;
    private int score;
    public void study(){};

    @Override
    public void fly() {
        System.out.println("fly");
    }


    @Override
    public void sing() {
        System.out.println("sing");
    }
}
