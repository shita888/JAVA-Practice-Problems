public class Frequency {
      public static void main(String[] args) {
         int arr[] = {1,2,3,1,3,1}; 
           System.out.println("Array:");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         
          System.out.println("\nFrequency Count:");
          
          for(int i=0;i<arr.length;i++)
          {          
                int count=1;
                if(arr[i]==-1){
                    continue;
                }
              for(int j=i+1;j<=arr.length-1;j++){
                  if(arr[i]==arr[j]){
                      count++;
                      arr[j]=-1;
                      
                  }
              }  
               System.out.println(arr[i]+": "+count);
            
         }
         
         
         
    }
}
