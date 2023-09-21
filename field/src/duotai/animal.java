package duotai;
//优点：减少代码冗余，不需要定义多个重载的方法
//缺点：无法调用子类特有的属性和方法
//属性不具有多态性
public class animal {
    public static void main(String[] args) {
int a=10;
int b=10;
String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
    }




    public void play(){
        System.out.println("动物玩");
    }
}
class dog extends animal{
    public void play(){
        System.out.println("狗玩");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
class cat extends animal{
    public void play(){
        System.out.println("猫玩");
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
class animaltest{
    public static void main(String[] args) {
        animaltest pet=new animaltest();
        pet.adopt(new dog());//animal animal=new dog();
//pet.adopt(new cat());
//pet.adopt(new animal());

    }
    public void adopt(animal animal){
        animal.play();
    }
}