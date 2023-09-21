package duixiang;

public class chapter {
    String name;
    int age;
    char sex;
    int a[]=new int[3];
    void eat(){
        String food="chicken";
        System.out.println("吃"+food);
    }
    void sleep(int hour){
        System.out.println("睡"+hour);
    }
public int age(int addage){
        age+=addage;
        return age;
}
int age(){
        age+=1;
        return age;
}
public int cheng(int x,int y){
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return x*y;
    }
}
class test{
    public test() {
    }

    public static void main(String[] args) {
    chapter d=new chapter();
int nianling=d.age(20);
d.age(5);
        System.out.println(nianling);
        System.out.println(d.age);
        d.age();
        System.out.println(d.age());
        System.out.println(d.cheng(3,6));




    }

}