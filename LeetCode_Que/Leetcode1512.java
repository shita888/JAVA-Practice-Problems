package LeetCode_Que;

public class Leetcode1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){6
                    // System.out.println(i+" "+j);
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1};
        numIdenticalPairs(nums);
    }
}
