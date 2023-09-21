package jihe;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

public class fanxing {
    @Test
    public void test1(){
        Map<String,Integer> map=new HashMap<>();//类型推断
        map.put("g",12);
        map.put("w",26);
        map.put("s",78);

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//        for (Object obj :
//                entrySet) {
//            System.out.println(obj);
//        }
       var entrySet=map.entrySet();//因为可以类型推断
       var entryIterator=entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> next = entryIterator.next();
            String key= next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"***"+value);
        }

    }
    @Test
    public void test2(){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num= (int) (Math.random()*100);
            al.add(num);
        }
        for (Integer value :
                al) {
            System.out.print(value+"\t\t");
        }
            al.removeIf(new Predicate<Integer>() {
                @Override
                public boolean test(Integer integer) {
                    return integer%2==0;
                }
            });
        System.out.println();
        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t\t ");
        }

    }
    @Test
    public void test3(){
        order o1=new order<>();
        o1.setType("obj");
        o1.setGrade(57);
        System.out.println(o1);
        order<String> o2=new order<>();
        o2.setType("str");
        o2.setGrade(23);
        System.out.println(o2);
     }
     @Test
     public void test4(){
         List<String> list1=new ArrayList<>();
         List<?> list2=new ArrayList<>();//?通配符可读，写入数据只能写null
         list1.add("abc");
         list2=list1;
         System.out.println(list2.get(0));
         list2.add(null);
     }
}
class order<T>{
    T type;
    int grade;

    public order() {
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public order(T type, int grade) {
        this.type = type;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "order{" +
                "type=" + type +
                ", grade=" + grade +
                '}';
    }
}
