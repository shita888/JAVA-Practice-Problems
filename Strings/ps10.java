public class ps10 { 
    public static int[] sortedSquares(int[] nums) {
        
 
  
     
       int brr[] = new int [nums.length];
      for(int i=0;i<nums.length;i++){
        int n=1; 
         for(int j=0;j<2;j++){
                n = n*nums[i];
         }
        //  System.out.println(n);
         brr[i] = n;

      }

  


    for (int i = 0; i < brr.length; i++) {
    for (int j = i + 1; j < brr.length; j++) {
        if (brr[i] > brr[j]) {
            int temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
        }
    }
} 

       for (int j =0; j < brr.length; j++) {
            System.out.println(brr[j]);
        }
 

       return brr;
    }
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
