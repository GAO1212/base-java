public class student {
    int number;
    int state;
    int score;
    public String show(){
        return "number:"+number+"state:"+state+"score:"+score;
    }

}


class studenttest{
    public static void main(String[] args) {

    student[] students=new student[20];
    for(int i=0;i<students.length;i++){
        students[i]=new student();
        students[i].number=i+1;
        students[i].state=(int)(Math.random()*6)+1;
        students[i].score=(int)(Math.random()*101);
    }
        for(int i=0;i<students.length;i++){
            if(students[i].state==3){ 
                System.out.println(students[i].show());
            }
        }


}
}
