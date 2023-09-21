package yichang;

public class persontest {
    public static void main(String[] args) {
        //person p1=new person("亚索",100);
        try {
            person p1=new person("亚索",-10 );
            System.out.println(p1);
        }catch (nolifevalueexception n){
            System.out.println(n.getMessage());
        }

    }
}
