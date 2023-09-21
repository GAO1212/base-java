package string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class date {
    @Test
    public void test1() throws UnsupportedEncodingException {
        String str=new String("hello中国");
        byte[] bytes1 = str.getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }//utf-8一个汉字3个字节
        byte[] bytes2 = str.getBytes("gbk");
        for (int i = 0; i < bytes2.length; i++) {
            System.out.println(bytes2[i]);
        }//gbk中一个汉字2个字节
        String s1 = new String(bytes1);
        System.out.println(s1);
    }
    public int getsubstringcount(String str,String substr){
        int count=0;
        int index=str.indexOf(substr);
        while(index>=0){
count++;
//index+=substr.length();
            index=str.indexOf(substr,index+substr.length());
        }
        return count;
    }
    @Test
    public void test2(){
String str="aadushaavosiaavs";
String substr="aa";
int count=getsubstringcount(str,substr);
        System.out.println(count);

     }
    @Test
    public void testSort() {
        String str = "abcwerthelloyuiodef";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String newStr = new String(arr);
        System.out.println(newStr);
    }
 @Test
 public void test3(){
 StringBuilder sb=new StringBuilder("abc");
     System.out.println(sb.length());
  }
  @Test
  public void test4(){
      System.out.println(System.currentTimeMillis());
   }
   @Test
   public void test5() throws ParseException {
       SimpleDateFormat sdf=new SimpleDateFormat();
       Date date1=new Date();
       System.out.println(date1);
       String format = sdf.format(date1);
       System.out.println(format);

       Date date = sdf.parse("2023/7/30 上午8:30");
       System.out.println(date);
   }
   @Test
   public void test6() throws ParseException {
   //SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
   SimpleDateFormat sdf=new SimpleDateFormat("G yyyy-MM-dd F--E  HH-mm-ss");

   Date dt=new Date();
       String format = sdf.format(dt);
       System.out.println(format);
       Date date=sdf.parse("公元 2023-07-30 5--周日  11-50-24");//注意与构造器格式相同
       System.out.println(date);
   }
@Test
public void test7(){
    Calendar calender=Calendar.getInstance();
    System.out.println(calender.get(Calendar.DAY_OF_YEAR));
    System.out.println(calender.get(Calendar.DAY_OF_WEEK));
    calender.add(Calendar.DAY_OF_YEAR,100);
    System.out.println(calender.get(Calendar.DAY_OF_YEAR));
}
@Test
public void test8(){
    LocalDateTime ldt1=LocalDateTime.now();
    System.out.println(ldt1);

    LocalDateTime ldt2=LocalDateTime.of(2018,7,14,5,20,55,123123);
    System.out.println(ldt2);
    System.out.println(ldt2.getDayOfMonth());

    LocalDateTime ldt3=ldt2.withDayOfMonth(21);
    System.out.println(ldt3);

    LocalDateTime ldt4=ldt2.plusDays(3);
    System.out.println(ldt4);
    ldt4.minusDays(1);

    LocalDate ld=LocalDate.now();
    System.out.println(ld);
    System.out.println(ld.isLeapYear());
}
@Test
public void test9(){
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MM/dd HH-mm-ss");
    LocalDateTime ldt=LocalDateTime.now();
    String format = dtf.format(ldt);
    System.out.println(format);
    TemporalAccessor parse = dtf.parse("23/07/30 13-25-15");
    LocalDateTime localDateTime=LocalDateTime.from(parse);
    System.out.println(localDateTime);
}
@Test
public void test(){
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MM/dd");
    TemporalAccessor birthday = dtf.parse("03/08/31");
  //  LocalDateTime ldt1=LocalDateTime.from(birthday);  格式不匹配 没有time
    LocalDate ldt1=LocalDate.from(birthday);
   LocalDateTime ldt2=LocalDateTime.now();
    System.out.println(ldt2.getDayOfYear()+(ldt2.getYear()-ldt1.getYear())*365+365- ldt1.getDayOfYear());
    double i=7633;
    System.out.println(i/365);

}
}
