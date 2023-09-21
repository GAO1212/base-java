public class digui {
    public static void main(String[] args) {
        demo test = new demo();
        int result1 = test.fangfa1(5);
        System.out.println(result1);
        int result2 = test.feibo(10);
        System.out.println(result2);
    }

}

  class demo {
      public static void main(String[] args) {
          demo ab=new demo();
          System.out.println(ab.feibo(25));

      }
      private  int simi=0;
    public int fangfa1(int n){
        if (n==1)
            return 1;
        else
            return fangfa1(n-1)*n;//阶乘

    }
    public int feibo(int n){
        if(n==1){
            return 1;}
        else if (n==2){
            return 1;}
        else {return feibo(n-1)+feibo(n-2);}
    }
}


