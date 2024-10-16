package day11_T;

import java.io.*;

public class T12 {
    public static void main(String[] args) {
        String srcEncoding ="GBK";
        String distEncoding ="UTF-8";
        /*String dirPath = "D:/test";
        String fileName = "source.txt";
        File dir = new File(dirPath,"dir.txt");
        File source = new File(dirPath,fileName);*/
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("source.txt"), srcEncoding);
             BufferedReader br = new BufferedReader(isr);
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("new.txt"),distEncoding);
             BufferedWriter bw = new BufferedWriter(osw)

        ){
            String len;
            while ((len = br.readLine())!=null){
                bw.write(len);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
