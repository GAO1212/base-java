package duixiang;
public class test {
    public static void main(String[] args) {
     customer c1=new customer("jane","smith");
     /*
     account a1=new account(1000,2000,1.23);
     c1.setAccount(a1);
     */
        c1.setAccount(new account(1000,2000,1.23));
     //a1.deposit(100);
     c1.getaccount().deposit(100);
     c1.getaccount().deposit(1100);
     c1.getaccount().withdraw(2000);
     c1.getaccount().getBalance();
    }
}
