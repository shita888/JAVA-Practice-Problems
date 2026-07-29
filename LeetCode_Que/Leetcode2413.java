package LeetCode_Que;

public class Leetcode2413 {
    public static void main(String[] args) {
         public static void main(String[] args) {
       int n=6,n1=n;
       int m=1,k=1,k1=1,i=0;
       int arr[] = new int[n];
       int brr[] = new int[n];
       int srr[] = new int[1];
       while(n>0){ 
        k=2*m;
        arr[i]=k;
        k1= n1*m; 
        brr[i]=k1;
        // System.out.println(k+" "+k1);
        m++;
        n--;
        i++;
       }
       
      for(int j=0;j<arr.length;j++){
          System.out.print(arr[j]+" ");
      }
      System.out.println();
      for(int j=0;j<brr.length;j++){
          System.out.print(brr[j]+" ");
      } 
      
      System.out.println();
       for(int j=0;j<arr.length;j++){
          for(int l=0;l<brr.length;l++){
              if(arr[j]==brr[l]){ 
                      System.out.println(arr[j]);  
                      
              }
          } 
       }
        
       
       
    }
    }
}
