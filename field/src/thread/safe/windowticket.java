package thread.safe;

import java.util.concurrent.locks.ReentrantLock;

public class windowticket implements Runnable{
     int ticket=100;
     private static final ReentrantLock lock=new ReentrantLock();
   // Object obj=new Object();

    @Override
    public void run() {
       while(true) {
           try{lock.lock();
           //synchronized (this){//同步监视器必须是唯一的，继承实现进程可选用类名.class
            if (ticket>0) {

           System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);
           ticket--;
       }else break;
           }                    // }
           finally {
               lock.unlock();
           }
       }
    }
}
class test{
    public static void main(String[] args) {

        windowticket w=new windowticket();
        Thread t1=new Thread(w,"窗口一");
        Thread t2=new Thread(w,"窗口二");
        Thread t3=new Thread(w,"窗口三");
//        t1.setName("售票口一");
//        t2.setName("售票口二");
//        t3.setName("售票口三");
        t1.start();
        t2.start();
        t3.start();
    }

}
