package jihe;

import org.junit.Test;

import java.util.*;

public class maptest {
    @Test
public void test1(){
        Map map=new HashMap();
        map.put("gws",20);
        map.put("aaa",25);
        map.put("bbb",40);
        map.put("ccc",10);
        System.out.println(map);
        System.out.println();
        //System.out.println(map.get("ccc"));
        //System.out.println(map.keySet());
        Iterator iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection coll=map.values();
        for (Object obj :
                coll) {
            System.out.println(obj);
        }

        Set entrySet = map.entrySet();
        Iterator iterator1= entrySet.iterator();
        while (iterator1.hasNext()) {
            //System.out.println(iterator1.next());
            Map.Entry entry= (Map.Entry) iterator1.next();
            System.out.println(entry.getKey()+"-_-_=="+entry.getValue());
        }
        System.out.println("**************");
        Set keySet = map.keySet();
        for (Object key :
                keySet) {
            System.out.println(key+"-_-_"+map.get(key));
        }
    }
    @Test
    public void test0(){
        HashMap map=new HashMap();
        map.put("gws",20);
        map.put("aaa",25);
        map.put("bbb",40);
        map.put("ccc",10);
        System.out.println(map);
        System.out.println(map.put("gws", 99));//修改操作
    }

}
