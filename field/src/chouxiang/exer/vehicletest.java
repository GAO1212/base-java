package chouxiang.exer;

public class vehicletest {
    public static void main(String[] args) {
        developer d1=new developer();
        vehicle[] vehicles=new vehicle[3];
        vehicles[0]=new bicycle("喜德盛","黄色");
        vehicles[1]=new elerctricvehicle("雅迪","绿色");
        vehicles[2]=new car("奔驰","白色","车牌号");

        for (int i = 0; i < vehicles.length; i++) {
            d1.takingvehicle(vehicles[i]);
            if (vehicles[i] instanceof ipower){
((ipower) vehicles[i]).power();
            }
        }
 ipower.test1();
        //vehicles[2].test();  接口的实现类无法调用接口的静态方法
        car c=new car();
        c.test2();//默认方法可以被实现类所调用继承，并且实现类可以重写此方法
        //如果某实现类继承了多个接口，并多个接口有同名同参的方法，实现类必须重写此方法ipower.super.test2();
    }
}
