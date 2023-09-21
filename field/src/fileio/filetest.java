package fileio;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class filetest {
    @Test
    public void test1(){
        File file1=new File("D:\\javatest\\hello.txt");
        File file2=new File("filetest.txt");
        boolean renamesuccess=file1.renameTo(file2);
        System.out.println(renamesuccess ? "修改成功" : "修改失败");
        System.out.println(file2.exists());
    }
    @Test
    public void test2(){
    File file=new File("C:\\Users\\GAO\\Pictures\\Saved Pictures");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        });
        for (String s :
                list) {
            System.out.println(s);
        }
    }
    @Test
    public void test3(){
        File file=new File("C:\\Users\\GAO\\Desktop\\aaaaa.txt");
        System.out.println(printsize(file));
    }
     public void printfilename(File file){
        if (file.isFile()){
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f :
                    files) {
                printfilename(f);
            }
        }
     }
     public void deletefile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f :
                    files) {
                deletefile(f);
            }

        }
        file.delete();
     }
     public long printsize(File file){
        long size=0;
        if (file.isFile()){
            size+=file.length();//字节数
        }else{File[] files = file.listFiles();
            for (File f:files)
                printsize(f);
           }
        return size;
     }
}
