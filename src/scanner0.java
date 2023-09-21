import java.util.Scanner;
public class scanner0 {
   /* public static void main(String[] args)
    {Scanner shuru=new Scanner(System.in);
        int b=(int)(Math.random()*100)+1;//1-100
        //int g=(int)(Math.random()*(b-a+1))+1  [a,b]
        double c=Math.random();
        System.out.println("随机数是"+c);
        System.out.println("随机数是"+b);
        double a= shuru.nextDouble();
        if(a==1)
            System.out.println("攻");
        else
            System.out.println("受");
        shuru.close();
    }*/
public static void main(String[] args)
{Scanner scan=new Scanner(System.in);
    double balance=0.0;
    boolean flag=true;
    do{
        System.out.println("---ATM---");
        System.out.println("1:存款");
        System.out.println("2：取款");
        System.out.println("3：显示余额");
        System.out.println("4:退出");
        System.out.println("请选择（1-4）");
        int shuru= scan.nextInt();
        switch (shuru){
            case 1:
                System.out.println("输入存款金额");
                double money1=scan.nextDouble();
                if(money1>0)
                    balance+=money1;
                  break;
            case 2:
                System.out.println("输入取款金额");
                double money2=scan.nextDouble();
                if(money2>0&&money2<balance)
                    balance-=money2;
                break;
            case 3:
                System.out.println("余额为："+balance);
                break;
            case  4:
                flag=false;
                break;
            default:
                System.out.println("输入有误");
        }

    }while(flag);
scan.close();
}
}
