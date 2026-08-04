package LeetCode_Que;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode3731{
    public static List<Integer> findMissingElements(int[] nums) {

        List<Integer> al = new ArrayList<>();

        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }  

        Arrays.sort(nums);  
        int c=min;
        for(int j=0;j<nums.length;j++){ 
            // System.out.print(nums[j]+" "); 
            if(c!=nums[j]){
                al.add(c);
                j--;
            }

            System.out.print(c+" "); 
            c++;

        }
        System.out.println(al);

        return al;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,7};
        findMissingElements(nums);

    }
}