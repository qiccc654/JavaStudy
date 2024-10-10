package day10;

import sun.applet.Main;

public class Test14_join {
    public static void main(String[] args) throws InterruptedException {
        Thread threadMain = Thread.currentThread();
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println(threadMain.getState());
                System.out.println("run");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
        t.join(200);

    }
}
