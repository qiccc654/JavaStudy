package day10;

public class Test13_State {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("运行:  "+Thread.currentThread().getState());
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("       ok...");
            }
        }, "thread1");

        System.out.println("新建:  "+thread1.getState());
        thread1.start();
        System.out.println("可运行:  "+thread1.getState());
        Thread.sleep(1000);
        System.out.println("等待:  "+thread1.getState());
        Thread.sleep(3000);
        System.out.println("销毁:  "+thread1.getState());
    }
}
