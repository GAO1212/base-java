import java.util.Scanner;
public class ya
{
    public static void main(String[] args)
    {
        int a = (int) (Math.random() * 6+1);
        int b = (int) (Math.random() * 7);
        double c =(int)(Math.random() * 7);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入压的内容");
        String guess = scan.next();
        scan.close();
        boolean result = false;
        switch (guess)
        {
            case "豹子":
                result = a == b && b == c;
                break;
            case "大":
                result = a + b + c > 9;
                break;
            case "小":
                result = a + b + c <= 9;
                break;
        }
        System.out.println("a,b,c分别是"+a+","+b+","+c);
        System.out.println(result?"猜中了":"猜错了");
    }
}
