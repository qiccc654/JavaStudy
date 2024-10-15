package day11_T;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        String dirPath = "D:\\";
        File dirFile = new File(dirPath);
        File[] files = dirFile.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //System.out.println(file.getName());
                String[] split = file.getName().split("\\.");
                //System.out.println(Arrays.toString(split));
                if ("txt".equals(split[1]) || "doc".equals(split[1]))
                    System.out.println(file.getAbsolutePath());
            }

            //System.out.println(file);
        }
    }
}
