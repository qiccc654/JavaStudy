package day3_5;

public class Random {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        for(int i = 1; i <= 10; i++){
            //第三步，调用nextInt(max-min+1) + min; 产生随机数
            int num = r.nextInt(20-10+1) + 10;
            System.out.println(num);
        }
    }
}
