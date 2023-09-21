package netcode;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetaddress {
    public static void main(String[] args) {
        try {
            InetAddress ia1 = InetAddress.getByName("192.168.1.6");
            System.out.println(ia1);

            InetAddress ia2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ia2);//连接网络到DNS解析域名
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getByName("127.0.0.1"));


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
