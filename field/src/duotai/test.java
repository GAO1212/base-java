package duotai;

public class test {
    public static void main(String[] args) {
        animal dongwu=new dog();//想用子类对象的特有方法
        //dongwu.eat();error
        if(dongwu instanceof dog d1){
            //dog d1=(dog)dongwu;//使用强转符
            d1.eat();
            System.out.println(dongwu==d1);
        }

    }
}
