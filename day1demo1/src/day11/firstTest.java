package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class firstTest {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        in = new FileInputStream("a.txt");


            int read = in.read();
        System.out.println(read);
        System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());
            System.out.println(in.read());

    }
}
