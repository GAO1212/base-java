import java.util.Scanner;
import java.util.Vector;

public class rank {
    public static void main(String[] args) {
        Vector vector=new Vector();
        Scanner scan=new Scanner(System.in);
        int maxscore=0;

        while (true){
            System.out.print("请输入学生成绩:(输入负数结束)");
            int scoreint=scan.nextInt();
            if(scoreint<0)
            {break;}
            //Integer integerscore=scoreint;
            vector.addElement(scoreint);//自动装箱
            if (maxscore<scoreint){
                maxscore=scoreint;
            }}
            char grade;
            for (int i = 0; i < vector.size(); i++) {
                Object obj=vector.elementAt(i);
                int in= (Integer)obj;//自动拆箱
                if (maxscore-in<10)
                    grade='A';
                else if (maxscore-in<20) {
                    grade='B';
                } else if (maxscore-in<30) {
                    grade='C';
                }else grade='D';
                System.out.println("同学"+i+"的成绩为"+in+"等级为"+grade);
            }

        System.out.println("最高分为"+maxscore);
        scan.close();
    }

}
