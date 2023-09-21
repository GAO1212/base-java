package thread.safe;

public class producercustomertest {
    public static void main(String[] args) {
        clerk clerk=new clerk();
        Thread pro1 = new producer(clerk);
        Thread cus1 = new customer(clerk);
        pro1.setName("生产者1");
        cus1.setName("消费者1");
        pro1.start();
        cus1.start();
    }

}
class clerk{
private int productnum=0;
public synchronized void addproduct(){
    if (productnum>=20)
        try {
        wait();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    else {
        productnum++;
        System.out.println(Thread.currentThread().getName()+"生产了第"+productnum+"个产品");
        notify();

    }
}
    public synchronized void minsproduct(){
        if (productnum<=0){try {
              wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }else {
            System.out.println(Thread.currentThread().getName()+"消费了第"+productnum+"个产品");
            productnum--;
            notify();

        }
    }

}
class producer extends Thread{
private clerk clerk;
public producer(clerk clerk){
    this.clerk=clerk;
}

    @Override
    public void run() {
    while(true){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clerk.addproduct();}

    }
}
class customer extends Thread{
    private clerk clerk;
    public customer(clerk clerk){
        this.clerk=clerk;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minsproduct();
                       }
    }
}
