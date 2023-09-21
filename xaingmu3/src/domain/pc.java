package domain;

public class pc implements equipment{
    @Override
    public String getdescription() {
        return model+"("+display+")";
    }
    private String model;//机器型号
    private String display;//显示器名称

    public pc(String model, String display) {
        this.model = model;
        this.display = display;
    }
}
