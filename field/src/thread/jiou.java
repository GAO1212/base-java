package thread;

public class jiou  {
    public static void main(String[] args) {
        //创建Thread类的匿名子类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    if (i%2==0)
                        System.out.println(Thread.currentThread().getName()+"偶数"+i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    if (i%2!=0)
                        System.out.println(Thread.currentThread().getName()+"奇数"+i);
                }
            }
        }.start();
        //实现了Runable接口的匿名实现类的匿名对象
        new Thread(new Runnable(){
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    if (i%2==0)
                        System.out.println(Thread.currentThread().getName()+"偶数"+i);
                }
        }
        }         ).start();
    }}

