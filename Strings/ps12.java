class Solution {
   public static int[] twoSum(int[] numbers, int target) {
           int brr[] = new int[2];
       
        int s=0;
        int e = numbers.length-1;
         while(s<e){ 
             if(numbers[s]+numbers[e]>target){
                 e--;
                 continue;
             }
             if(numbers[s]+numbers[e]==target){ 
                    brr[0] = s+1;
                    brr[1] = e+1;
                    break; 
             } 
             s++;
         }
         
        for(int i=0;i<brr.length;i++){
             System.out.println(brr[i]);
        }
         
        return brr;
    }
     
    public static void main(String [] args){
        int numbers[]={2,3,4};
        int target = 6;
        twoSum(numbers,target);
    }
}
