package jihe;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiestest {

    @Test
    public void test() throws IOException {
        File file=new File("info-properties");
        //System.out.println(file.getAbsoluteFile());
        FileInputStream fis=new FileInputStream(file);

        Properties properties=new Properties();
        properties.load(fis);

        String name=properties.getProperty("name");
        String password=properties.getProperty("password");
        System.out.println(name+"++"+password);
     }
}
