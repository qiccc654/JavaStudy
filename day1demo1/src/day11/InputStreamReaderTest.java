package day11;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("c.txt"),"gbk"));
    }
}
