package LeetCode_Que;

public class Leetcode204 { 
    
    public static int countPrimes(int n) {  
                
        int count=0;
            for(int k=2;k<n ;k++){ 
            boolean b = false; 
            
                for(int i=2;i*i<=k ;i++){  
                        if(k%i==0){ 
                      b = true;
                      break;
                    }  
                 }

                 if(b==false){
                         System.out.println(" P"+k);
                         count++;
                     } 
                }
            
            
    

 

        return count;
    }
    public static void main(String[] args) {
        int n=5000000;
        countPrimes(n);
    }

}
