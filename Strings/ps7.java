 //.......... complete 989 problem using Array
 class Solution {
      public static int[] plusOne(int[] digits)  {
       int rem,rem1,k,n=34;
       int c=0, c1=0; 
       for(int i=digits.length-1;i>=0;i--){
          
            rem = n%10; 
            digits[i] = digits[i] + rem;
            if(digits[i]>=10){  
                c1++;
                rem = digits[i]%10;
                rem1 = digits[i]/10;
                digits[i]=rem; 
                digits[i-1] = digits[i-1]+rem1;  
            } 
            if(i==0){
                break;
            }
            n=n/10;
            c++;  
        }
          System.out.println(c+" "+c1); 
         for(int j=0;j<digits.length;j++){
            System.out.print(digits[j]+" ");  
        } 
        System.out.println(); 
        
        
        int brr[] = new int[digits.length+1];
          for(int j=0;j<digits.length;j++){
            
            int x=digits[0];
             if(j==0 && digits[0]>=10){
                    int first = (x / 10);   // 1
                    int second = (x % 10);  // 0 
                      brr[0] = first;
                      brr[1] = second; 
             }else{
                 brr[j] = digits[j]; 
             }
        } 
        
        
         for(int j=0;j<digits.length;j++){
            System.out.print(brr[j]+" ");  
        } 
        
        return digits;
     }
    public static void main(String[] args) {
       int digits[]={1,2,0,0}; 
          plusOne(digits);
       
        
    }
}