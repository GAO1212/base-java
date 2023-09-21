package shuzu;

public class paixu {
    public static void main(String[] args) {
        int array[]=new int[]{5,45,23,18,62,32,86};
        for (int i=0;i< array.length-1;i++){
            for (int j=0;j< array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temporary=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temporary;
                }
            }
        }//冒泡排序
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int head=0,end=array.length-1;
        int target=18;
        boolean flag=false;
        while(head<=end){
            int mid=(head+end)/2;
            if (target==array[mid])
            {System.out.println("找到了"+target+"位置为"+(mid+1));break;}
            else if (target<array[mid])
                end=mid-1;
            else head=mid+1;
        }//二分法

        }
    }

