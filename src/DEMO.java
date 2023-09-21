public class DEMO {
    public static void main(String[] args)
     {int count=0;
         long start=System.currentTimeMillis();
for (int i=2;i<=100;i++){
    boolean flag=true;
    for (int j=2;j<=Math.sqrt(i);j++){
        if (i%j==0)
        { flag=false;
        break;}
    }
    if(flag){count++;
        //System.out.print(i+" ");
     }
     flag=true;             }
         System.out.println();
         long end=System.currentTimeMillis();
         System.out.println("花费的时间为"+(end-start));
         System.out.println("质数共有"+count);
     }
}

