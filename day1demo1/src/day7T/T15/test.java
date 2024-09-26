package day7T.T15;

public class test {
    public static void main(String[] args) {
        Integer i1 = new Integer(33);
        Integer i2 = new Integer(33);
        System.out.println(i1 == i2);
        System.out.println(i2.equals(i1));
        Integer i3 = new Integer(148);
        Integer i4 = new Integer(148);
        System.out.println(i3 == i4);//自动装箱,超出类型范围,不缓存到池子,创建对象所以==不相等
        System.out.println(i3.equals(i4));

    }
}
