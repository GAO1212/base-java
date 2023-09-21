package chouxiang.exer;

public abstract class vehicle {
    private String brand;
    private String color;

    public vehicle(String brand, String color) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public vehicle() {
    }
    abstract void run();
}
