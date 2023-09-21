package reflection;

import org.junit.Test;

import java.lang.reflect.Method;


public class newinstancetest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {//空参构造器、构造器权限问题
    Class clazz=user.class;
        user u1 =(user)clazz.newInstance();
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println(declaredMethod);
        }

        System.out.println(u1);
    }
}
