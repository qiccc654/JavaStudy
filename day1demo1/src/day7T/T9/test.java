package day7T.T9;

import java.util.Arrays;
/*对该接⼝进⾏实现，让其可以具有处理以下两种字符串的功能：
A)对字符串按照 | 进⾏分割，并得到数组，例如 传⼊字符串"a|b|c"，返回["a","b","c"]
B)对字符串按照 - 进⾏分割，并得到数组，例如 传⼊字符串"a-b-c"，返回["a","b","c"]
要求使⽤匿名内部类的⽅式来完成*/
interface Action{
    public String[] test(String str);
}
public class test {
    public static void main(String[] args) {
      Action action  =new Action() {
            @Override
            public String[] test(String str) {


                if (str.charAt(1)=='-') {
                    String[] parts = str.split("-");
                    return  parts;
                }else if (str.charAt(1)=='|'){
                    String[] parts = str.split("\\|");
                    return  parts;
                }
                return null;
            }
        };
        System.out.println(Arrays.toString(action.test("a-b-c")));
        System.out.println(Arrays.toString(action.test("a|b|c")));
        };


    }

