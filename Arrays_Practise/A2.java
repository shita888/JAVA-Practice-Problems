public class A2 {
     public static void printArr(int arr[]) {
          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]); 
          }
      }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6}; 
        printArr(arr);
        
        System.out.println("");
          for(int i=0;i<arr.length;i++)
          { 
               if(i%2!=0){
                    int odd = arr[i]*2;
                    System.out.println(odd);
               }else{
                    int add = arr[i]+10;
                    System.out.println(add); 
               }
          }
        
        
        
        
        //  char n = '\0';
        //  System.out.println((int)n);
        
        
        
    //     int x[] = {10,20,30};
    //     change(x);
    //     System.out.println(x[2]); 
    // }
    // public static int change(int x[]) {
    //     x[2]=100; 
    //     return x[2];
    
    
    
    }
}
