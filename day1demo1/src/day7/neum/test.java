package day7.neum;
enum week1{
    sec("第二"),mon("mang"),tue();
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    week1() {
    }

    week1(String desc) {
        this.desc = desc;
    }
}
public class test {
    public static void main(String[] args) {
        week1 mon = week1.mon;
        System.out.println(mon.toString());
        System.out.println(mon.getDesc());
        System.out.println(mon.ordinal());
        System.out.println(mon);
        System.out.println(mon.name());


    }
}
