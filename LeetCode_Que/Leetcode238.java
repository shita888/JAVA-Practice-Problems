package LeetCode_Que;

public class Leetcode238 {
        public static int[] productExceptSelf(int[] nums) {
        // int brr[] = new int[nums.length];
        // int n=0;
        // for(int i=0;i<nums.length;i++){ 
        //     int p=1; 
        //       for(int j=0;j<nums.length;j++){
        //           if( nums[j]==nums[i] && j==i){
        //             continue;
        //           }else{ 
        //             p=p*nums[j];
        //           }
        //       }
        
        // System.out.println(p);
        //  brr[i] = p;
        //  }
        // return brr;
        
        int s=0;
        int e=nums.length-1;
        while(s<e){ 
            int p=1;
            System.out.println(p*nums[e]); 
            e--;
        }
        
        
        return nums;
    }
     
    public static void main(String [] args){
        int nums[]={1,2,3,4};  
        productExceptSelf(nums);
    }
}
