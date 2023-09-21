package fileio;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logger {
    public static void main(String[] args) {
log("完成了Java基础的学习，仍需复习3天，转战MySQL");
    }
    public static void log(String msg){
        PrintStream out= null;
        try {
            out = new PrintStream(new FileOutputStream("E:\\Java练习\\kong\\log.txt",true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);
        Date nowdate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String format = sdf.format(nowdate);
        System.out.println(format+"--->"+msg);
        if (out != null) {
            out.close();
        }
    }
    @Test
    public void test(){
        //FileUtils.copyFile();
     }

}
