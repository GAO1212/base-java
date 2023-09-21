package duixiang;

public class account {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;//账号

    public double getBalance() {

        System.out.println(balance);return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;//余额

    public double getAnnualinterestrate() {
        return annualinterestrate;
    }

    public void setAnnualinterestrate(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    private double annualinterestrate;//年利率
    public account(int i,double b,double a){
        this.id=i;
        balance=b;
        annualinterestrate=a;
    }
    public void withdraw(double amount){
        if(balance>=amount&&amount>0){
            balance-=amount;
            System.out.println("成功取出"+amount);
        }else System.out.println("余额不足,取款失败");//取钱

    }
    public void deposit(double amount){
        if(amount>0){balance+=amount;
        System.out.println("成功存入"+amount);}
    }
}
