package chouxiang.exer;

public class developer {
    String name;
    int age;

    public developer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void takingvehicle(vehicle vehicle){
        vehicle.run();
    }
}
