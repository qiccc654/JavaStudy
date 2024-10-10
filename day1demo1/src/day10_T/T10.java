package day10_T;
/*
10.编写程序，实现创建3个线程。
A) 分别输出1~10之间的数字及对应的输出数字线程名
B) 线程优先级分别为最高、普通、最低
C) 每个线程输出一次后，休眠一秒钟
D) 思考是否每次都是优先级最高的线程先打印输出？*/
public class T10 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println(Thread.currentThread().getName()+":  "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
