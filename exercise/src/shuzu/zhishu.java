package shuzu;

public class zhishu {
    public  static void main(String args[]){
        int sum=0;int count=0;
        for (int i=2;i<=100;i++){
            boolean a=true;
            for(int j=2;j<i;j++){
                    if (i%j==0){
                        a=false;
                    break;}
            } if (a==true)
            { count++;
                System.out.print(i+" ");
            sum+=i;
             }}
        System.out.println();
        System.out.println(sum);
        System.out.println(count);
        for(int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){if (i>=j)
                System.out.print(i+"*"+j+"="+i*j+" ");
        }
            System.out.println();
        }
    }

}
