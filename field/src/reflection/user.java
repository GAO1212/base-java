package reflection;
@test(way = "测试")
public class user {
    public String username="mekio";
    private int password=123123;

    public user() {
    }

    public user(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
    public void show(String name){
        System.out.println("我是"+name+"信息："+getUsername()+"--"+getPassword());
    }
}
