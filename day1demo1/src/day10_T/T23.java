package day10_T;
/*
* 23.使用多线程编码实现：火车站卖票实例，四个卖票窗⼝随机卖出50张票(static成员tickers)
注意:
不能卖出重复的票，
不要卖出编号为负值的票，
每个窗⼝出票后随机休眠时间范围在[100,200]ms。
* */
public class T23 {
    private static int tickers = 50;
    public  static  void sale (){
        if (tickers==0){
            return;
        }
        tickers--;
    }
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public  void run() {
                while (true) {
                    synchronized (""){
                        if (tickers>0){
                            System.out.println(Thread.currentThread().getName()+"卖出第"+tickers+"张票");
                            sale();
                            try {
                                "".wait((long) ((Math.random() * 101) + 100));
                                //Thread.sleep((long) ((Math.random() * 100) + 100));
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }else break;
                    }
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
