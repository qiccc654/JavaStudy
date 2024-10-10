package day10_T;
/*
编写代码，实现创建T1、T2、T3三个线程，保证T2在T1执行完后执行，T3在T2执行完后执行。
* */
public class T17 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    t1.join();
                    System.out.println("T2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                    System.out.println("T3");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t3.start();
        t1.start();
        t2.start();



    }
}
