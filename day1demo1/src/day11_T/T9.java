package day11_T;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T9 {
    public static void main(String[] args) {
        String sourcePath = "D:/test/img.jpg";
        String targetPath = "D:/test/img_copy";
        String extension = ".jpg";
        byte[] buffer = new byte[1024 * 10]; // 10KB的缓冲区
        int length;

        try {
            for (int i = 1; i <= 10; i++) {
                String targetFile = targetPath + i + extension;
                try (
                        FileInputStream fis = new FileInputStream(sourcePath);
                        BufferedInputStream bis = new BufferedInputStream(fis);
                        FileOutputStream fos = new FileOutputStream(targetFile);
                        BufferedOutputStream bos = new BufferedOutputStream(fos)
                ) {
                    while ((length = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, length);
                    }
                    // 刷新缓冲区，确保所有数据都被写入
                    bos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
