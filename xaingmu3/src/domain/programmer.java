package domain;

public class programmer extends employee{
private int memember;

    public int getMemember() {
        return memember;
    }

    public void setMemember(int memember) {
        this.memember = memember;
    }

    private status status= domain.status.FREE;
private equipment equipment;
    public programmer(int id, String name, int age, double salary,equipment equipment) {
        super(id, name, age, salary);
        this.equipment=equipment;
    }
    public programmer(){
    }

    public domain.status getStatus() {
        return status;
    }

    public void setStatus(domain.status status) {
        this.status = status;
    }

    public String toString() {
        return super.toString()+ "\t程序员\t"+status+ "\t\t\t\t\t"+equipment.getdescription();
    }
    public String getDetailsForTeam(){
        return memember+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
    }
}
