package day7T.T8;

import com.sun.org.apache.bcel.internal.generic.NEW;

interface Inner{
    void show();
}
class Outer{
   static void method(){
        new Inner() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
public class Test {
    public static void main(String[] args) {
        Outer.method();
    }
}
