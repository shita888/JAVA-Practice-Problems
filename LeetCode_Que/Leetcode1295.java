package LeetCode_Que;

public class Leetcode1295 {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int rem , c=0;
            while(nums[i]>0){
                rem = nums[i]%10;
                c++;
                nums[i] = nums[i]/10;
            }
            if(c%2==0){ 
                // System.out.println(c);
                count++;
            }
        }
        System.out.println(count);



        return count;
    }
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        findNumbers(nums);
    }
}
