package thread;

public class imp implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+"偶数"+i);
        }
    }

    public static void main(String[] args) {
        imp p=new imp();
        new Thread(p,"线程名").start();
Thread.currentThread().setName("主线程");
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+"偶数"+i);
        }
        Thread p1=new Thread(p);
        p1.setName("子线程");
        try {
            p1.sleep(2000);//睡眠即停止运行多少毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p1.start();

    }
}
