package day10;

public class Test10_run {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t.start();
        t.run();

    }
}
