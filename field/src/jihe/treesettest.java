package jihe;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class treesettest {
    @Test
    public void test1(){
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof person && o2 instanceof person)
                { person p1=(person) o1;
                    person p2=(person) o2;
                    int value=p1.getName().compareTo(p2.getName());//从小到大
                    if (value!=0)
                        return value;
                    return -(p1.getAge()-p2.getAge());//从大到小
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeSet set= new TreeSet(comparator);
        person p1=new person("jack",23);
        person p2=new person("tom",16);
        person p3=new person("jerry",56);
        person p4=new person("lisa",23);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


     }
}
