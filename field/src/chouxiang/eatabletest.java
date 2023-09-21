package chouxiang;

public class eatabletest {
    public static void main(String[] args) {
        eatable[] persons=new eatable[3];
        persons[0]=new chinese();
        persons[1]=new american();
        persons[2]=new indian();
        for (int i = 0; i < persons.length; i++) {
            persons[i].eat();
        }
        eatable e=new eatable(){
            public void eat(){
                System.out.println("吃");
            }
        };


        new eatable(){
            public void eat(){
                System.out.println("吃");
            };
        }.eat();

    }
}
