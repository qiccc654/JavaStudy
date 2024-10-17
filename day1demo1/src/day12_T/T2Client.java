package day12_T;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.*;

public class T2Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        List<Teacher> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            if (Objects.equals(s,"quit"))break;
            String[] split = s.split("-");
            list.add(new Teacher(split[0],Integer.parseInt(split[1]),Float.parseFloat(split[2])));
        }
        /*for (Teacher s : list) {
            System.out.println(s.toString());
        }*/
        oos.writeObject(list);
        socket.close();
    }
}
