package day12_T;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class T4Client3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            if (Objects.equals(s,"quit"))break;
            ps.println(s);
        }
        ps.close();

    }
}
