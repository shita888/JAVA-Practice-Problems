package LeetCode_Que;

public class Leetcode486 {
    public static boolean predictTheWinner(int[] nums) {
        int sum=0 , sum1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){ 
                sum = sum+nums[i];
            }else{ 
                sum1 = sum1+nums[i];  
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
 System.out.println();
        int A=0,B=0;  
        if(sum>sum1){ 
            for(int i=0;i<nums.length;i++){
                if(i%2!=0){ 
                    A = A+nums[i];
                }else{ 
                    B = B+nums[i]; 
                } 
            } 
        }else{
            for(int i=0;i<nums.length;i++){
                if(i%2!=0){ 
                    B = B+nums[i]; 
                }else{ 
                    A = A+nums[i];
                } 
            }  
        }
        System.out.println(A);  
        System.out.println(B);  
        
        if(A>B){
            System.out.println("T");
            return true;
        }else{ 
            System.out.println("F");
            return false;
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {1,5,2};
        predictTheWinner(nums);
    }
}
