package LeetCode_Que;

public class Leetcode1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
     
        int arr[] = new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && i!=j){
                    // System.out.print(nums[j]+" "); 
                       c++;
                     arr[i]=c; 
                 }
            } 
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {6,5,4,8};
        smallerNumbersThanCurrent(nums);
    }
}
