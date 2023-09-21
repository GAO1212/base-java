public class train {
    public static String getColumnTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = (n - 1) % 26;
            char ch = (char) (rem + 'A');
            sb.insert(0, ch);
            n = (n - 1) / 26;
        }
        return sb.toString();
    }

    public static int findMaxSubarraySum(int[] nums) {
        int maxSum = nums[0]; // 初始化最大和为数组的第一个元素
        int currentSum = nums[0]; // 当前子数组的和
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            // 如果当前子数组的和为负数，那么将当前元素作为起点重新计算和
            if (currentSum < 0) {
                currentSum = nums[i];
            }
            // 否则将当前元素加入到当前子数组
            else {
                currentSum += nums[i];
            }

            // 更新最大和
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;

//    public static void main(String[] args) {
//        int n = 25;
//        String columnTitle = getColumnTitle(n);
//        System.out.println(columnTitle);
        //   }
    }
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }
    public static void main(String[] args) {
//        int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
//        int maxSum = findMaxSubarraySum(nums);
//        System.out.println(maxSum);
        int a1=1,a2=2;
        swap(a1,a2);
        System.out.println(a1+","+a2);
        //main方法先入栈，swap方法出栈交换了形参


    }

}
