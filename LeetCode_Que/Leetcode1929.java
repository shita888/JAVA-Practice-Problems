package LeetCode_Que;

public class Leetcode1929 { 
    public static int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }

        int Merge[] = new int[nums.length + arr.length];
        int p=0;
        for(int i=0;i<nums.length;i++){
           Merge[p++] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
           Merge[p++] = arr[i];
        }
        // for(int i=0;i<Merge.length;i++){
        //     System.out.println(Merge[i]);
        // }

        return nums;
    } 
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        getConcatenation(nums);
    }
}
