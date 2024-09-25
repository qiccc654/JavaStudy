package day7.neum;

enum Week {
    //枚举元素必须写在第一行，如果有多个的话，用逗号','隔开，
//最后用分号';'结束
//如果';'后面没有其他内容的话，';'可以省略，但不建议省略
    MON, TUE,WED;

}
public class Test072_Define01 {
    public static void main(String[] args) {
        //1.枚举元素引用格式：枚举类名.枚举元素名;
//注意枚举类名不能省略
        Week w1 = Week.MON;
        Week w2 = Week.TUE;
        Week w3 = Week.WED;
        //2.输出枚举对象，默认输出枚举元素名
        System.out.println(w1);
        System.out.println(w2.toString());
        System.out.println("-----------");
        //3.获取枚举元素名：跟元素名一样的同名字符串
        System.out.println(w3.name());
        //4.获取枚举元素编号：从0开始，逐个加1
        System.out.println(w1.ordinal());   //0
        System.out.println(w2.ordinal());   //1
        System.out.println(w3.ordinal());   //2
    }
}