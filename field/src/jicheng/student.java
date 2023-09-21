package jicheng;

public class student extends person{
    public student(){}
public student(String subject){
        
    System.out.println(13);
    this.subject=subject;
}
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;


}
