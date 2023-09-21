package chouxiang.exer;

public class car extends vehicle implements ipower{
    String carnumber;
    public car() {
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public car(String brand, String color, String carnumber) {
        super(brand, color);
        this.carnumber = carnumber;
    }

    void run() {
        System.out.println("汽车通过内燃机驱动行驶");
    }

    @Override
    public void power(){
        System.out.println("汽车通过汽油提供动力");
    }

    @Override
    public void test2() {
        System.out.println("重写的接口默认方法");
    }
}
