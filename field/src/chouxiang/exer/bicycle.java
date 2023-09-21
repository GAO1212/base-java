package chouxiang.exer;

public class bicycle extends vehicle{
    public bicycle(String brand, String color) {
        super(brand, color);
    }
    public bicycle() {
    }

    @Override
    void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
