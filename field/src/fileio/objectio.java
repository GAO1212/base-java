package fileio;

import org.junit.Test;

import java.io.*;

public class objectio {
    @Test
    public void test1() throws IOException {
        File file=new File("object.txt");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        oos.writeUTF("高文升");//序列化
        //自定义类要实现序列化必须实现serializable接口，并标识static final long的一个UID（唯一标识当前类的）
        oos.flush();//刷新
        oos.close();

    }
    @Test
    public void test2() throws IOException {
        File file=new File("object.txt");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        String s = ois.readUTF();//反序列化
        System.out.println(s);
        ois.close();

    }
    @Test
    public void test3(){
        String s="gws";
        String s1 = s.toUpperCase();
        System.out.println(s1);

     }
}
