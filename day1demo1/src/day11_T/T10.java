package day11_T;

import java.io.*;

/*
* 10.编程实现：如果现在有一款只能试用10次的软件，超过10次之后就需要提醒用户购买正版软件。（程序运行一次，使用次数就要减一次）。
提示：将试用的次数写到一个文件中，每次启动时对其进行读取并进行判断。
* */
public class T10 {
    public static void main(String[] args) {
        String path = "test.txt";
        try (// 使用true来追加内容
             FileReader reader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String s = bufferedReader.readLine();
            // 检查s是否为null或者空字符串
            if (s != null && !s.isEmpty()) {
                int i = Integer.parseInt(s);
                System.out.println(i);
                if (i > 0) {
                    System.out.println("可以使用");
                    i--;
                    String s1 = Integer.toString(i);
                    FileWriter writer = new FileWriter(path);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write(s1);
                    bufferedWriter.close();
                }else System.out.println("使用次数用完");
            } else {
                System.out.println("文件为空或读取到的内容为null");
            }
        } catch (NumberFormatException e) {
            System.out.println("数字格式错误: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}