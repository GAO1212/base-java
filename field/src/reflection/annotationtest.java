package reflection;

import org.junit.Test;

public class annotationtest {
    @Test
    public void test(){
        Class c=user.class;
        test declaredAnnotations =(test) c.getDeclaredAnnotation(test.class);
        System.out.println(declaredAnnotations.way());
    }

}
