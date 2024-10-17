package day12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestBrowser {
    public static void main(String[] args) throws IOException, InterruptedException {
        String host = "127.0.0.1";
        int port = 8888;
        Socket socket = new Socket(host, 8888);
        System.out.println(socket);
        //套接字流
        OutputStream out = socket.getOutputStream();
        //
        out.write("hellow".getBytes());

        System.out.println(out);


        out.close();
        socket.close();
    }
}
