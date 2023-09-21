package domain;

public class notebook implements equipment{
    @Override
    public String getdescription() {
        return model+"("+price+")";
    }
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }
}
