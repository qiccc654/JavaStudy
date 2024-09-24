package day6_T.T21;

public class Worker extends Person{
    private static int base = 3000;
    private int day;
    private String type;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Worker(String name, String type, int day) {
        super(name, type);
        this.day = day;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "day=" + day +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void salary() {
        System.out.println(toString()+day*base);
    }
}
