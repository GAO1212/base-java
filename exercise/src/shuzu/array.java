package shuzu;

public class array {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("输入学生个数");
        int shuru= scan.nextInt();
        int stu[]=new int[shuru];
        for(int i=0;i<shuru;i++){
           // int grade= scan.nextInt();
            stu[i]= scan.nextInt();
        }
        int max=0;
        for(int i=0;i<shuru;i++){
            if(max<stu[i])
                max=stu[i];
        }
        System.out.println("最高分是"+max);
        char flag;
        for (int i=0;i<stu.length;i++) {
            if (stu[i] >= max - 10) {
                flag='A';
                System.out.println("student" + i + "得分是" + stu[i] + "成绩为A");
            }
           else if (stu[i] >= max - 20 && stu[i] <= max - 10) {
               flag='B';
                System.out.println("student" + i + "得分是" + stu[i] + "成绩为B");
            }
            else if (stu[i] >= max - 30 && stu[i] <= max - 20) {
                flag='C';
                System.out.println("student" + i + "得分是" + stu[i] + "成绩为C");
            } else  {
                flag='D';
                System.out.println("student" + i + "得分是" + stu[i] + "成绩为D");
            }System.out.println("student" + i + "得分是" + stu[i] + "成绩为"+flag);
        }

scan.close();*/

int array[]=new int[]{5,17,23,45,62,77,86};
int delete=4;
        System.out.println(array.length);
for (int i=delete;i<array.length-1;i++){
    array[i]=array[i+1];
}
array[array.length-1]=0;
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");}//缩容
            int newarray[]=new int[array.length<<1];
            for (int i=0;i<array.length;i++){
 newarray[i]=array[i];
        }
            newarray[array.length]=23;
        newarray[array.length+1]=45;
        System.out.println();
        for (int i=0;i<newarray.length;i++){
            System.out.print(newarray[i]+" ");}//扩容
}
}
