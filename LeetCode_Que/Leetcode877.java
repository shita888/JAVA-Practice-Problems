package LeetCode_Que;

public class Leetcode877 {
    public static  boolean stoneGame(int[] piles) {
        // System.out.println("* * * * * Start The Game * * * * *");
      int sum=0 , sum1=0;
        for(int i=0;i<piles.length;i++){
            if(i%2!=0){ 
                sum = sum+piles[i];
            }else{ 
                sum1 = sum1+piles[i];  
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
 System.out.println();
        int A=0,B=0;  
        if(sum>sum1){ 
            for(int i=0;i<piles.length;i++){
                if(i%2!=0){ 
                    A = A+piles[i];
                }else{ 
                    B = B+piles[i]; 
                } 
            } 
        }else{
            for(int i=0;i<piles.length;i++){
                if(i%2!=0){ 
                    B = B+piles[i]; 
                }else{ 
                    A = A+piles[i];
                } 
            }  
        }
        System.out.println(A);  
        System.out.println(B);  
        
        if(A>B){
            return true;
        }else{ 
            return false;
        }
    }
    public static void main(String[] args) {
        // int piles[] = {3,7,2,3};
        int piles[] = {5,3,4,5};
        stoneGame(piles);

    }
}
