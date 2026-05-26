public class TwoSum {
    
    public static void main(String[] args) {
        
         int arr[] = {1,2,3,2,1}; 
         
         System.out.println("Array:");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         
         int brr[] = new int[arr.length];
         for(int i=0;i<brr.length;i++){
             brr[i]=arr[i];
         }
          System.out.println("\nBrray:");
         for(int i=brr.length-1;i>=0;i--){
             System.out.print(brr[i]+" ");
         }
         
         
          System.out.println("\nCheck the Array:");
          int target=1 ;
          for(int i=brr.length-1;i>=0;i--)
          {        
              for(int j=0;j<brr.length;j++)
              {
                  if(arr[i]==arr[j]){
                      target=1; 
                  }else{
                     target++; 
                  }
              }   
          }
          
          if( target==1){
                      System.out.println( "Palindrome");  
                  }else{
                     System.out.println( "NOT Palindrome");  
                  }
         
    }
}
