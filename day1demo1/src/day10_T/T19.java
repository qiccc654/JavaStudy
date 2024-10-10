package day10_T;

/*
* 19.编写程序，实现以下要求：
A)定义子线程1，线程处理函数中输出 1-50，每隔5ms输出⼀次
B)定义子线程2，线程处理函数中输出 A-Z，每隔10ms输出⼀次
C)要求，当线程1输出30之后，线程2插队进来优先输出，全部输出后，线程1再输出31-50。
* */
public class T19 {
    public static void main(String[] args) {
        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++) {

                    try {
                        System.out.println((char) i);
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t1 = new Thread("线程1") {
            @Override
            public void run() {
                for (int i = 1; i < 51; i++) {
                    if (i > 30) {
                        try {
                            t2.join();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    try {
                        System.out.println(i);
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };


        t1.start();
        t2.start();

    }
}
