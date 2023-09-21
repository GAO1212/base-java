package shuzu;

import java.util.Arrays;

public class arraylei {
    public static void main(String[] args) {
        int array[]=new int[]{1,3,94,64,24};
        Arrays.sort(array);//快速排序
        System.out.println(Arrays.toString(array));
        int index=Arrays.binarySearch(array,3);
        System.out.println(index);
        Arrays.fill(array,6);
        System.out.println(Arrays.toString(array));
    }
}
