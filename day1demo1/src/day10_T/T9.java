package day10_T;

public class T9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("T1"){
            public void run() {
                for (int i = 1; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+":  "+i);
                    i++;
                }
            }
        };
        Thread t2 = new Thread("T2"){
            public void run() {
                for (int i = 2; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+":  "+i);
                    i++;
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t2.start();

    }
}
