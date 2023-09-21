package thread.safe;

public class tongxin implements Runnable{
    private int shu=1;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = shu; i <=100 ; i++) {
                this.notify();//需要和同步监视器所调用对象一致
                if (shu<=100){
                System.out.println(Thread.currentThread().getName()+shu);
                shu++;
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }             }else break;
            }
        }
    }
}
class tongxintest{
    public static void main(String[] args) {
        tongxin tx=new tongxin();
        Thread t1=new Thread(tx,"线程一");
        Thread t2=new Thread(tx,"线程二");
t1.start();
t2.start();
    }

}
