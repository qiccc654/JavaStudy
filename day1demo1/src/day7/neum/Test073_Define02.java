package day7.neum;

enum Week2 {
    //枚举元素必须为第一行有效代码
//枚举元素调用的 构造方法，必须存在，否则编译报错
    MON, TUE(), WED("星期三");
    /* 源代码描述：
   *
     public static final Week MON = new Week();
    *    public static final Week TUE = new Week();
    *    public static final Week WED = new Week("星期
   三");
    */
    //枚举类数据成员和成员方法，可以包含一个或多个
    private String desc;
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
//枚举类构造方法，如果不提供，系统会提供默认构造方法，
   // private修饰
    //如果用户自定义枚举类构造方法，则系统不再提供
    private Week2() {}
    //自定义枚举方法，注意必须用private修饰
    private Week2(String desc) {
        this.desc = desc;
    }
}
public class Test073_Define02 {
    public static void main(String[] args) {
        Week2 w1 = Week2.MON;
        System.out.println(w1);
        System.out.println("------------");
        Week2 w2 = Week2.TUE;
        System.out.println(w2);
        System.out.println("w2.desc: " + w2.getDesc());
        System.out.println("------------");
        Week2 w3 = Week2.WED;
        System.out.println(w3);
        System.out.println("w3.desc: " + w3.getDesc());
    }
}