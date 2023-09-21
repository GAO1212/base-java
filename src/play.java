

public class play {

    public static void main(String[] args) {
        int i1=20;
        Integer ii1= i1;//自动装箱
        int i2=ii1;//自动拆箱
        Integer ii2=i1+2;
        System.out.println(ii2.toString());
        boolean b1=true;
        String bb1=String.valueOf(b1);//基本数据类型和包装类转化为string类型
        System.out.println(bb1.toString());
        String s1="1223";
        int i3=Integer.parseInt(s1);//string类型转化为int类型  包装类的静态方法parsexx()
        System.out.println(i3+27);

    }

    public void method(){
        System.out.println("方法");

    }
    static class nei1 {

public void method1(){
    System.out.println("静态内部类方法");
}
    }
    class nei2{
        void method2(){
            System.out.println("非静态内部类方法");
            play.this.method();
        }

    }
}
 class test{
     public static void main(String[] args) {
         play.nei1 n1=new play.nei1();
         n1.method1();
         play p1=new play();
         play.nei2 n2=p1.new nei2();
         n2.method2();
     }
}
