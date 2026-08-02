package LeetCode_Que;

public class Leetcode3432 {
    public static int countPartitions(int[] nums) {
        int c=0;
    for(int i=0;i<nums.length;i++){
        if(i==nums.length-1){
            break;
        }
              int sum=0,sum1=0;
        for(int j=0;j<=i;j++){
             sum = sum+nums[j]; 
            }
            // System.out.print(sum+" ");
            for(int j=i+1;j<nums.length;j++){
                sum1 = sum1+nums[j];
            }
            // System.out.print(sum1+" ");
            int diff = sum-sum1;
            // System.out.print(sum-sum1+" ");
            if(diff%2==0){
                c++;
            }
            // System.out.println();
    }
    System.out.println(c);

        return c;
    }
    public static void main(String[] args) {
        // int nums[] = {1,2,2};
        int nums[] = {10,10,3,7,6};
        countPartitions(nums);
    }
}
