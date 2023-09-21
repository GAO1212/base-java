package fileio;

import org.junit.Test;

import java.io.*;

public class bufferstream {
    @Test
    public void test(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            File srcfile=new File("wallhaven-kx8mv1.jpg");
            File destfile=new File("picture.jpg");

            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

//            InputStreamReader   inputStreamReader=new InputStreamReader(bis,"gbk");
//            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fos,"utf8");

            byte[] buffers=new byte[1024];
            int len;
            while((len=bis.read(buffers))!=-1){
                bos.write(buffers,0,len);
            }
            System.out.println("成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
     }

}
