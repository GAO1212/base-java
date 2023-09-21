package yichang;

public class student {
    int id;
    public void regist(int id){
        if (id>0)
            this.id=id;
        else
            throw new RuntimeException("id非法");
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        student s1=new student();
        s1.regist(-10);
        System.out.println(s1);
    }
}


