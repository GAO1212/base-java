package newway;

public record order(String name,int age) {//默认final修饰了，此类不能有显式的父类，不能有方法声明为abstract
    public order(){
        this(null,0);
    }
    public void test(){
        System.out.println("测试记录类");
    };
}
