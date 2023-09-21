package netcode;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class tcptest2 {
    @Test
    public void client() throws IOException {
        InetAddress ia=InetAddress.getByName("192.168.1.6");
        Socket socket=new Socket(ia,9982);
        File file=new File("C:\\Users\\GAO\\Pictures\\Saved Pictures\\wallhaven-2yzg56.jpg");
        FileInputStream fis = new FileInputStream(file);
        OutputStream os = socket.getOutputStream();
        byte[] buffer=new byte[1024];
        int len;
        while((len= fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        System.out.println("客户端发送完毕");
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] bytes=new byte[5];
        int lens;
        while ((lens= is.read(bytes))!=-1){
            baos.write(bytes,0,lens);
        }
        System.out.println(baos);
        baos.close();
        os.close();
        fis.close();
        socket.close();

    }

     @Test
     public void server() throws IOException {
         ServerSocket serverSocket = new ServerSocket(9982);
         Socket accept = serverSocket.accept();
         InputStream is = accept.getInputStream();
         File file=new File("net-pic.jpg");
         FileOutputStream fos=new FileOutputStream(file);
         byte[] buffer=new byte[1024];
         int len;
         while((len= is.read(buffer))!=-1){
             fos.write(buffer,0,len);
         }
         System.out.println("数据接收完成");
         OutputStream os = accept.getOutputStream();
         os.write("你的图片很漂亮".getBytes());
         os.close();
         fos.close();
         is.close();
         accept.close();
         serverSocket.close();
     }
}
