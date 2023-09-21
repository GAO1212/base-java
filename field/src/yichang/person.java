package yichang;

public class person {
    private String name;
    private int lifevalue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifevalue() {
        return lifevalue;
    }

    public void setLifevalue(int lifevalue) {
        if (lifevalue<0) throw new nolifevalueexception("生命值不能为负数"+lifevalue);
        else this.lifevalue = lifevalue;
    }

    public person(String name, int lifevalue) {
        //this.name = name;
        setName(name);
        setLifevalue(lifevalue);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", lifevalue=" + lifevalue +
                '}';
    }
}
