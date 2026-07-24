package LeetCode_Que;

public class Leetcode2460 {
    public static int[] applyOperations(int[] nums) {

        int s=0;
        int e=s+1;
        while(e!=(nums.length)){
            if(nums[s] == nums[e]){
                nums[s] = nums[s]+nums[e];
                nums[e] = 0;
            }
            e++;
            s++;
        } 


        int arr[] = new int[nums.length];
        int j=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            if(nums[i]!=0){  
                 arr[j] = nums[i];  
                 System.out.println(nums[i]); 
                 j++;
            } 
         } 

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        return arr;
    }
    public static void main(String[] args) {
        //   int nums[] = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        // int nums[] = {1,0,2,0,3,4};
        int nums[] = {312,312,436,892,0,0,528,0,686,516,0,0,0,0,0,445,445,445,445,445,445,984,984,984,0,0,0,0,168,0,0,647,41,203,203,241,241,0,628,628,0,875,875,0,0,0,803,803,54,54,852,0,0,0,958,195,590,300,126,0,0,523,523};
          applyOperations(nums);
    }
}
