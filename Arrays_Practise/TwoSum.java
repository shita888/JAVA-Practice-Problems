public class TwoSum {
    public static void main(String[] args) {
         int arr[] = {1,2,3,1,3,1}; 
           System.out.println("Array:");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         
          System.out.println("\nTwo Sum:");
          int target=1;
          for(int i=0;i<arr.length;i++)
          {        
              for(int j=i+1;j<=arr.length-1;j++){
                  if(arr[i]+arr[j]==target){
                    //   System.out.println(arr[i]+" "+arr[j]+": "+target);
                      System.out.println("Yes");
                       break;
                  }
              }   
            
         }
         
         
         
    }
}
