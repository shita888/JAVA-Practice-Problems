package LeetCode_Que;

import java.util.Arrays;

public class Leetcode414 {
    public static int thirdMax(int[] nums) {
// System.out.println(nums.length);
        Arrays.sort(nums);
        // int arr[] = new int[];
        // int s=0;
        // int e=s+1;
        // while(s!=nums.length){
        //     if(s!=e){

        //     }
        // }


        int max1 = nums[0];
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max1 = nums[i];
            }
        }
        if(nums.length>=3){
             
            int max2 = nums[0];
            for(int i=0;i<nums.length;i++){  
                if(max2<nums[i] && nums[i]<max1){
                    max2 = nums[i]; 
                }
            }
            int max3 = nums[0];
            for(int i=0;i<nums.length;i++){
                if(max3<nums[i] && nums[i]<max1 && nums[i]<max2 ){
                    max3 = nums[i];
                }
            }
            if(max3==max2){
                max3 = max1;
            }
            System.out.println("1st: "+max1);
            System.out.println("2nd: "+max2);
            System.out.println("3rd: "+max3);
            
            return max3;
        }else{
            System.out.println(max1);
            return max1;
        }
        
    }
    public static void main(String[] args) {
        // int nums[] = {2,2,3,1};
        // int nums[] = {2,3,1};
        int nums[] = {1,1,3};
        thirdMax(nums);
    }
}
