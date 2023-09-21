package duixiang;

public class customer {
    private String firstname;
    private String lastname;
    private account zhanghu;
    public customer(String f,String l){
        firstname=f;
        lastname=l;
    }

    public void setAccount(account a) {
        zhanghu=a;
    }
    public account getaccount(){
        return zhanghu;
    }
}
