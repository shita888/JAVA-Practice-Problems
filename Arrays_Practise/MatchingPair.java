package Arrays_Practise;

public class MatchingPair{
    
    public static void main(String[] args) {
        
         int arr[] = {1,2,3,2}; 
         
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
                  if(arr[i]==brr[j]){
                      target=1; 
                  }else{
                     target++; 
                  }
              }   
          }
          
        if( target==1){
                      System.out.println( "Palindrome"); 
                      
            System.out.println("\nCheck the Matching Pairs:");
            int t=0 ;
            for(int i=0;i<arr.length/2;i++  )
            {        
              for(int j=0;j<brr.length/2;j++)
              {
                  if(arr[i]==arr[j]){
                      t++;
                       System.out.println(arr[i]+" "+brr[j]); 
                  } 
                }   
             }
            System.out.println("Pairs: "+t); 
            
        }else{
                System.out.println( "NOT Palindrome"); 
               
             System.out.println("\nCheck the Matching Pairs:");
            int t1=0 ; 
             for(int i=0;i<arr.length;i++)
            {        
              for(int j=i+1;j<arr.length;j++)
              {
                  if(arr[i]==arr[j]){
                      t1++;
                       System.out.println(arr[i]+" "+arr[j]); 
                  } 
                }   
             }
            System.out.println("Pairs: "+t1); 
        
        }
         
          
         
         
         
    }
}
