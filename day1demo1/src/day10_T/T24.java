package day10_T;

public class T24 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();


        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (obj1) {
                        System.out.println("th1拿到左筷子");
                        synchronized (obj2) {
                            System.out.println("th1拿到右筷子");
                            System.out.println("th1吃 水盆羊肉");
                            System.out.println("-------------------");
                        }
                    }
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (obj2) {
                        System.out.println("th2拿到右筷子");
                        synchronized (obj1) {
                            System.out.println("th2拿到左筷子");
                            System.out.println("th2吃到了水盆羊 肉");
                            System.out.println("-------------------");
                        }
                    }
                }
            }
        };
        th1.start();
        th2.start();
    }
}
