package day12;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test064_ReversalClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        System.out.println(socket+"成功连接");
        InputStream in = System.in;
        OutputStream out = socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        while (true){
            Scanner sc = new Scanner(in);
            System.out.println("输入"+sc);

            PrintStream pr = new PrintStream(out);
            pr.println(sc);
        }
    }
}
