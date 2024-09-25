package day7T.T9;

import java.util.Arrays;

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

