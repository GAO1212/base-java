//单例模式：饿汉式
public class model {

    private model(){};
    private static model mo=new model();
    public void shuchu(){
        System.out.println("饿汉式");

    }
     public static model getmodel() {
        return mo;
    }
}
class modellan{
    private modellan(){};
    private static volatile modellan instance=null;//voaltile避免出现指令重排

    public static modellan getInstance() {
        if (instance==null)//避免不必要的同步
            synchronized (modellan.class){
        if (instance==null){
            instance=new modellan();
        }
        }
        return instance;
    }
}
class modeltest{
    public static void main(String[] args) {
        model.getmodel().shuchu();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
        System.out.println(args.length);
    }
}
