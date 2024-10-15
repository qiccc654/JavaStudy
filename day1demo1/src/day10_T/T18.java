package day10_T;
/*
* 编写程序，创建线程，将该线程睡眠，然后打断该线程睡眠状态，查看是否被打断
* */
public class T18 {
        public static void main(String[] args) throws InterruptedException {
            // 创建线程
            Thread thread = new Thread(() -> {
                try {
                    System.out.println("线程开始睡眠...");
                    // 使线程睡眠10秒
                    Thread.sleep(10000);
                    System.out.println("线程睡眠结束");
                } catch (InterruptedException e) {
                    // 线程在睡眠中被中断
                    System.out.println("线程在睡眠中被中断");
                    // 重新设置中断状态
                    Thread.currentThread().interrupt();
                }
            });

            // 启动线程
            thread.start();

            // 主线程休眠1秒，确保子线程开始睡眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 中断子线程的睡眠
            thread.interrupt();
            System.out.println("线程是非被打断"+thread.isInterrupted());
            Thread.sleep(100);
            System.out.println(thread.getState());


        }
    }

