package day10;

public class synchronizedTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized ("1"){
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized ("1"){
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };



    }

}
