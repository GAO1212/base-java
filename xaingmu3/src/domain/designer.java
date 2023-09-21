package domain;

public class designer extends programmer{
    private double bonus;//奖金
    private equipment equipment;
    private status status= domain.status.FREE;

    public domain.status getStatus() {
        return status;
    }

    public void setStatus(domain.status status) {
        this.status = status;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public designer(int id, String name, int age, double salary, double bonus, equipment equipment) {
        super(id, name, age, salary,equipment);
        this.bonus = bonus;
        this.equipment=equipment;
    }
    public designer(){

    }

    public domain.equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(domain.equipment equipment) {
        this.equipment = equipment;
    }

    public String toString() {
        return getdetails()+ "\t设计师\t"+getStatus()+"\t"+getBonus()+"\t\t\t"+ "\t"+equipment.getdescription();
    }
    public String getDetailsForTeam(){
        return getMemember()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t设计师\t"+getBonus();
    }
}
