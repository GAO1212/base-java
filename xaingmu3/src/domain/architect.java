package domain;

public class architect extends designer{
    private int stock;//股票

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public architect(int id, String name, int age, double salary, double bonus, domain.equipment equipment, int stock) {
        super(id, name, age, salary, bonus, equipment);
        this.stock = stock;
    }
    public architect(){
    }

    @Override
    public String toString() {
        return getdetails()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+getStock()+"\t"+getEquipment().getdescription();
    }
    public String getDetailsForTeam(){
        return getMemember()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t架构师\t"+getBonus()+"\t"+getStock();
    }
}
