package day10_T;

import java.security.PrivateKey;
import java.util.Random;

/*
* 11.编写程序，使用多线程实现龟兔赛跑游戏。
A) 可以使用随机数取得0~1之间的随机数模拟比赛进程
B) 如果随机数在0~0.3之间代表兔子开始跑,每次跑2米。如果随机数在0.3~1之间代表乌龟开始跑，每次跑1米
C) 总距离为100米，先跑完100米者为胜利者，输出赛跑过程及谁取得冠军
* */
public class T11 {
    private static final int win = 100;
    static int i = 0;
    static int j = 0;
    static String winner = null;

    public static void main(String[] args) {


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < win) {
                    if (winner != null) {
                        System.out.println("比赛结束，胜利者是：" + winner);
                        break;
                    }
                    if (Math.random() <= 0.3) {
                        i += 2;
                        try {
                            System.out.println(Thread.currentThread().getName() + "在" + i + "米处");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (i >= win) {
                        winner = "兔子";
                    }
                }
            }
        }, "兔子");

        Thread g = new Thread(new Runnable() {
            @Override
            public void run() {
                while (j < win) {
                    if (winner != null) {
                        System.out.println("比赛结束，胜利者是：" + winner);
                        break;
                    }
                    if (Math.random() > 0.3) {
                        j++;
                        try {
                            System.out.println(Thread.currentThread().getName() + "在" + j + "米处");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (j >= win) {
                        winner = "乌龟";
                    }
                }
            }
        }, "乌龟");
        t.start();
        g.start();
    }
}
