package chouxiang.exer;

public interface ipower {
    void power();
    static void test1(){
        System.out.println("静态接口方法体");
    }
    public default void test2(){
        System.out.println("默认方法体");
    }
}
