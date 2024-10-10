package day9_T;
/*
8.编写Test3_DivisionByZero类。要求：
A) 编写方法：division()：要求执行10/0操作，并使用异常处理机制处理可能会产生的异常，编写main()：调用division()。
B) 修改division()：执行10/0不变，但不在方法中处理产生的异常，改将异常抛出，修改main()：调用division()并处理其抛出的异常。
*/
public class Test3_DivisionByZero {
    public static void main (String[] args) throws Exception {

        System.out.println(division());
        
    }

    public static String division () throws Exception {
       String i = "hello";
        try {
            i+="!";
            System.out.println("try"+i);
            return i;
        } finally {
            i+="word";
            System.out.println("finally"+i);
        }
    }
}
