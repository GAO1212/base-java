package chouxiang.exer;

public class elerctricvehicle extends vehicle implements ipower{
    public elerctricvehicle() {
    }

    public elerctricvehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    void run() {
        System.out.println("电车需要充电电能驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
