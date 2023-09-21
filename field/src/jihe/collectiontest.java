package jihe;

import org.junit.Test;

import java.util.*;

public class collectiontest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add("ASD");
        coll.add(2003);//自动装箱
        coll.add("高");
        System.out.println(coll);

        System.out.println(coll.contains("ASD"));
        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object obj :
                coll) {
            System.out.println(obj);
        }//用于遍历数组和集合

    }
    @Test
    public void test2(){
        List list=new ArrayList<>();//有序可重复
        list.add("gao");
        list.add("g");
        list.add("a");
        list.add("a");
        list.add("o");
        for (Object obj :
             list   ) {
            System.out.println(obj);
        }
        //list.remove(0);
        list.add(2,"gg");
        for (Object obj :
                list   ) {
            System.out.println(obj);
        }
     }
     @Test
     public void test3(){
     Set set=new HashSet<>();;//无需且不可重复  用来过滤重复数据
     set.add("gao");
     set.add("g");
     set.add("a");
     set.add("o");
     Iterator iterator=set.iterator();
     while(iterator.hasNext()){
         System.out.println(iterator.next());
     }
      }
      @Test
      public void test4(){
      List list=Arrays.asList("g","w","w","s",123);
          System.out.println(list);
       }
}
