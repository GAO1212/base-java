package reflection.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class juicertest {
    @Test
    public void test() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties=new Properties();
        File file=new File("src/config.properties");
        FileInputStream fis=new FileInputStream(file);
        properties.load(fis);
        String fruitname = properties.getProperty("fruitname");
        Class aClass = Class.forName(fruitname);
        Constructor declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        fruit fru = (fruit) declaredConstructor.newInstance();
        juicer juicer=new juicer();
        juicer.run(fru);
    }

}
