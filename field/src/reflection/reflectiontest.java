package reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectiontest {
    @Test
    public void test1() throws Exception {
//        Object obj=new String("gws");
//        System.out.println(obj.getClass());
        Class clazz=user.class;
        Field usernamefield =clazz.getField("username");
        user u1=(user)clazz.newInstance();
        user u2=(user)clazz.newInstance();
        usernamefield.set(u1,"jack");
        System.out.println(usernamefield.get(u1));
    }
    @Test
    public void test2() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<user> clazz =user.class;
        user u = clazz.newInstance();
        Field declaredFieldpassword = clazz.getDeclaredField("password");
        declaredFieldpassword.setAccessible(true);
        declaredFieldpassword.set(u,121212);
        System.out.println(declaredFieldpassword.get(u));
    }
    @Test
    public void test3() throws Exception{
        Class clazz=user.class;
        user u1=(user)clazz.newInstance();
        Method showmethod = clazz.getDeclaredMethod("show", String.class);
        showmethod.setAccessible(true);
        showmethod.invoke(u1,"gws");//返回类型为void，返回值为null
     }
     @Test
     public void test4() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         Class clazz=user.class;
         Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
         declaredConstructor.setAccessible(true);
         user u = (user)declaredConstructor.newInstance("ross", 28);
         System.out.println(u);
     }
     public <T> T getinstance(String classname) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         Class aClass = Class.forName(classname);
         Constructor declaredConstructor = aClass.getDeclaredConstructor();
         declaredConstructor.setAccessible(true);
         return (T) declaredConstructor.newInstance();
     }
     @Test
     public void test0() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String classname="reflection/user.java";
     user u=getinstance(classname);
         System.out.println(u.getUsername());

     }
}
