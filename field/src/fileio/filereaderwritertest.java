package fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderwritertest {
    @Test
    public void test1() throws IOException {
        File file=new File("filetest.txt");
        FileReader fr=new FileReader(file);
        int data= fr.read();
        while(data!=-1){
            System.out.print((char) data);
            data=fr.read();
        }
        fr.close();
     }
@Test
public void test2(){
    FileReader fr= null;
    try {
        File file=new File("filetest.txt");
        fr = new FileReader(file);
         char[] cbuffer=new char[5];
       int len;
       while ((len= fr.read(cbuffer))!=-1){
           for (int i = 0; i < len; i++) {
               System.out.print(cbuffer[i]);
           }
       }
    } catch (IOException e) {
        e.printStackTrace();
    } finally { try {
        if (fr!=null)
        fr.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
@Test
public void test3(){
    FileWriter fileWriter= null;
    try {
        File file=new File("shuchu.txt");
        fileWriter = new FileWriter(file,true);
        fileWriter.write("\ni love you");
        fileWriter.write("\nbut you don not love me");
        System.out.println("输出成功");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (fileWriter!=null)
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }
    @Test
    public void test4(){
        FileWriter fileWriter= null;
        FileReader fileReader=null;
        try {
            File srcfile=new File("shuchu.txt");
            File destfile=new File("test");
            fileReader=new FileReader(srcfile);
            fileWriter = new FileWriter(destfile,true);
            char[] cbuffer=new char[5];
            int len;
            while((len=fileReader.read(cbuffer))!=-1){
                fileWriter.write(cbuffer,0,len);
            }
            System.out.println("输出成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter!=null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } try {
                if (fileReader!=null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
