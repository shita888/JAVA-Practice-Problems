package LeetCode_Que;

public class Leetcode1480 { 
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        return arr;
    } 
    public static void main(String[] args) {
         int nums[] = {1,1,1};
         runningSum(nums);
    }
}
