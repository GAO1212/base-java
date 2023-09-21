
public class abc {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int arr[]=new int[]{12,56,47};
        System.out.println(arr);
        char arr1[]=new char[]{'a','b','c'};
        System.out.println(arr1);
abc d=new abc();
String ai=d.duo("-","l","o","v","e");
        System.out.print(ai);
    }
public String duo(String fu,String ...nums){
        String result="baby";
        for (int i=0;i< nums.length;i++){
            if(i==0)
                System.out.print(nums[i]);
            else
                System.out.print(fu+nums[i]);
            System.out.println();

        }return result;

}
}


