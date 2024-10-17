package day12_T;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class T2Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();
        InputStream is = accept.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<Teacher> o = (List<Teacher>) ois.readObject();
        BufferedWriter bw = new BufferedWriter(new FileWriter("T2.txt"));
        PrintStream printStream = new PrintStream(accept.getOutputStream());
        printStream.println("success");
        for (Teacher s : o) {
            System.out.println(o.toString());
            bw.write(s.toString());
            bw.flush();
        }
        printStream.close();
        bw.close();
        socket.close();

    }
}
