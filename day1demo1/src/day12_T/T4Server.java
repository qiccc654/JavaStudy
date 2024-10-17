package day12_T;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
* 线程池实现多客户端并行
*/
public class T4Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9999);
        System.out.println("启动成功");
        ExecutorService es = Executors.newFixedThreadPool(10);
        while (true){
            Socket accept = socket.accept();
            es.execute(new Runnable() {
                @Override
                public void run() {
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));){
                        String len;
                        while ((len=br.readLine())!=null){
                            System.out.println(Thread.currentThread().getName()+"---------" +len);
                            Thread.sleep(1000);
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

        }
    }
}
