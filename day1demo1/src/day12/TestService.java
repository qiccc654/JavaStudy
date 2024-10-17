package day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestService {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("启动服务器");

        System.out.println("等待客户端响应");
        Socket socket = serverSocket.accept();
        System.out.println("有客户端启动成功");
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024 * 10];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

        socket.close();
        serverSocket.close();
    }
}
