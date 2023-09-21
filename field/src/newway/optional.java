package newway;

import org.junit.Test;

import java.util.Optional;

public class optional {//针对空指针异常的容器
    @Test
    public void test(){
    String star="迪丽热巴";
//    star=null;
        Optional<String> s = Optional.ofNullable(star);
        String otherstar="杨幂";
        String anElse = s.orElse(otherstar);
        System.out.println(anElse);
        System.out.println(s.get());
    }
}
