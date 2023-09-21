package newway;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamapi {
    @Test
    public void test1(){
        List<String> list=new ArrayList<>();
        list.add("g");
        list.add("w");
        list.add("s");
        Stream<String> stringStream = list.stream();
        //Arrays.stream();
        Stream<String> sorted = stringStream.sorted();

    }


}
