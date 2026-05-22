package Arrays_Practise;
import java.util.Scanner; 
public class P1 {
    // Online Java Compiler 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size:");
        // int s = sc.nextInt();
       
        //  int arr[] = new int[s];
         
        //  for(int i=0;i<arr.length;i++){
        //      System.out.print("Enter element ["+i+"] :");
        //      arr[i]=sc.nextInt();
        //  }
         
        //   System.out.print("\nArray Elements are => ");
        //  for(int j=0;j<arr.length;j++){
        //      System.out.print(j+"\t");
        //  }
        //  int brr[] = new int[arr.length];
        //      for(int i=0;i<arr.length;i++){
        //       brr[i]=arr[i];
        //  } 
        
        
         
        // for(int k=0;k<arr.length-1;k++){
        //      for(int l=0;l<arr.length-1;l++){
        //          if(arr[k]>arr[l+1]){  
        //              int t = arr[k];
        //              arr[k]=arr[l]; 
        //              arr[l]= t;
        //          }  
        //      } 
        // }
           int arr[]={1,2,3,0,1};
         int p =0;
          System.out.println("\n Elements are => ");
         for(int j=0;j<arr.length;j++){
             System.out.println(arr[j]);
         } 
          
            System.out.println("\nArray Palindrome or Not => ");
            for(int i=0;i<arr.length;i++){
                 for(int j=arr.length-1;j>=0;j--){
                  int e  = arr[i];
                  int s = arr[j];
                   if(arr[e]!=arr[s]){
                    System.out.println("NOT Palindrome");
                  }else{
                    System.out.println("Palindrome");  
                  }
              }  
                System.out.println(); 
               
            }
              
            
               
         
        
        
         
        //   System.out.println("Second Largest: "+arr[1]);
        //   System.out.println("Third Largest: "+arr[2]);
    }
} 
