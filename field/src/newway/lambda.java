package newway;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Function;

public class  lambda {
    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("thread");
            }
        };
        r1.run();
        Runnable r2= () -> System.out.println("thread");
        r1.run();
     }
     @Test
     public void test2(){
         //Comparator<Integer> comp=(o1, o2) -> Integer.compare(o1,o2);
         Comparator<Integer> comp= Integer::compare;
         int c=comp.compare(13,22);
         System.out.println(c);
      }
      @Test
      public void test3(){
          Function<Double,Long> fun1=Math::round;
          System.out.println(fun1.apply(12.6));
      }
      @Test
      public void test4(){
        Function<Integer,String[]> func=new Function<Integer, String[]>() {
            @Override
            public String[] apply(Integer integer) {
                return new String[integer];
            }
        };


      Function<Integer,String[]> fun=String[]::new;
      String[] strs=fun.apply(4);
          System.out.println(strs[3] = "gws");
      }
}
