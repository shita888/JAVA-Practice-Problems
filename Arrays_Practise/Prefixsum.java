public class Prefixsum {
    public static void main(String[] args) {
         int arr[] = {2,1,1,1};
         int sum=0;
         int start = 0;
         int end = 2;
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
         
          System.out.println("Prefix Sum:");
          
          for(int i=0;i<arr.length;i++)
          {
              sum=sum+arr[i];
              for(int j=start;j<=end;j++){
                     if(i==j){
                 System.out.println(sum);
             }
              }
            //  if(i==0){
            //      System.out.println(sum);
            //  }else if(1==1){
            //      System.out.println(sum);
            //   }else if(i==2){
            //      System.out.println(sum);
            //  }else  if(i==3){
            //      System.out.println(sum);
            //  } 
            
         }
         
         
         
    }
}
