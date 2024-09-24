package day6_T.T17;

class Automobile{
    private String plateNumber;
    private String brand;

    public int getRent(int day){

        return 0;
    }

    public Automobile(String plateNumber, String brand) {
        this.plateNumber = plateNumber;
        this.brand = brand;
    }

    public Automobile() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Truck extends Automobile{
   private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Truck(String plateNumber, String brand, String type) {
        super(plateNumber, brand);
        this.type = type;
    }

    public Truck(String type) {
        this.type = type;
    }

    @Override
    public int getRent(int day) {
        switch (type) {
            case "小型":
                return day * 300;
            case "中型":
                return day * 350;
            case "大型":
                return day * 500;
        }
       return 0;
    }
}
class bus extends Automobile{
    private int wei;

    public bus(String plateNumber, String brand, int wei) {
        super(plateNumber, brand);
        this.wei = wei;
    }

    public bus(int wei) {
        this.wei = wei;
    }

    @Override
    public int getRent(int day) {
        return wei>16?400*day:600*day;
    }
}
public class T17 {
    public static void main(String[] args) {
        Truck truck = new Truck("小型");
        System.out.println(truck.getRent(2));
    }
}
