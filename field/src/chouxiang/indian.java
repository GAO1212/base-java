package chouxiang;

import org.junit.Test;

public class indian implements eatable{
    @Override
    public void eat() {
        System.out.println("印度人用手抓饭");
    }
    @Test
    public void test(){
        StringBuilder stringBuilder=new StringBuilder("gws");
        System.out.println(stringBuilder);

     }
}
