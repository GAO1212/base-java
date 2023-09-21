package netcode;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class tcptest1 {
    @Test
    public void client(){
        Socket socket=null;
        OutputStream os=null;
        try {
            InetAddress inetAddress=InetAddress.getByName("192.168.1.6");//对方IP
            int port=9981;//对方端口号
            socket=new Socket(inetAddress,port);
            os = socket.getOutputStream();
            os.write("我是客户端啊".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void server(){
        int port=9981;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            Socket acceptsocket = serverSocket.accept();
            System.out.println("服务端已开启");
            System.out.println("获取到了"+acceptsocket.getInetAddress().getHostAddress()+"的连接");
            InputStream inputStream = acceptsocket.getInputStream();
            byte[] bytes=new byte[5];//b
            int len;
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            while((len=inputStream.read(bytes))!=-1){
//                String str=new String(bytes,0,len);
//                System.out.print(str);//有可能出现乱码
                baos.write(bytes,0,len);
            }
            System.out.print(baos);
            System.out.println("\n数据接收完毕");
            serverSocket.close();
            inputStream.close();
            acceptsocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
