package reflection;

import org.junit.Test;

public class Classtest {
    @Test
    public void test1() throws ClassNotFoundException {//获取Class实例的几种方式
        Class aclass= user.class;
        System.out.println(aclass);

        user u=new user();
        Class bclass = u.getClass();

        String classname="reflection/user";//全类名
        Class cclass = Class.forName(classname);

        Class dclass = ClassLoader.getSystemClassLoader().loadClass("reflection/user");


    }
     @Test
     public void test2(){

     }

}
