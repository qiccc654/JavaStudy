package day7.neum;
enum Gender {
    MALE, FEMALE
}

public class Test071_EnumBasic {
    public static void main(String[] args) {
        //2.枚举类实例化对象
//  固定格式：枚举类 引用名 = 枚举类.枚举元素值;
        Gender g1 = Gender.MALE;
        Gender g2 = Gender.MALE;
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("-------------");
        Gender g3 = Gender.FEMALE;
        Gender g4 = Gender.FEMALE;
        System.out.println(g3);
        System.out.println(g4);
    }
}