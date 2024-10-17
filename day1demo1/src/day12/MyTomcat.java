package day12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/*
* http://;ocalhost:8080/index.html
* */
public class MyTomcat {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("启动");
        Socket socket = server.accept();
        System.out.println(";浏览器访问");
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String lin;
        while (!Objects.equals(br.readLine(),"")){
            
        }


    }
}
