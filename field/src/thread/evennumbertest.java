package thread;

public class evennumbertest extends Thread{
public evennumbertest(){}
    public evennumbertest(String name){
        super(name);
 }
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class test{
    public static void main(String[] args) {
        evennumbertest e1=new evennumbertest("线程一");
        e1.start();
        evennumbertest e2=new evennumbertest();
        e2.start();
        //以下为main方法中执行的线程
        for (int i = 1; i < 100; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+i);
        }
//        ExecutorService service= Executors.newFixedThreadPool(10);
//        ThreadPoolExecutor serive1=(ThreadPoolExecutor) service;
//        serive1.setMaximumPoolSize(50);
//service.execute(new evennumbertest());
////Thread.currentThread().setName("线程");
//service.shutdown();

    }
}
