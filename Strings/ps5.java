import java.util.Scanner;
public class ps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[5]; 
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int arr[]={1,2,2,2,4};
// Print all elements.
    //     System.out.print("Array:");
    //  for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
// Find the sum of all elements.
// System.out.println();
// int sum=0;
//  for(int i=0;i<arr.length;i++){
//              sum = sum+arr[i];
//         }
//         System.out.println(sum);
// // Find the maximum element.
// int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//               if(max<arr[i]){
//                 max = arr[i];
//               }
//         }
//         System.out.println("Max:"+max);
// // Find the minimum element.
// int min=arr[0];
//         for(int i=0;i<arr.length;i++){
//               if(min>arr[i]){
//                 min = arr[i];
//               }
//         }
//         System.out.println("Min:"+min);
// Count even and odd numbers.
// System.out.print("Even:");
//         for(int i=0;i<arr.length;i++){
//               if(arr[i]%2==0){ 
//                 System.out.print(arr[i]+" ");
//               } 
//         } 
// System.out.print("Odd:");
//         for(int i=0;i<arr.length;i++){
//               if(arr[i]%2!=0){ 
//                 System.out.print(arr[i]+" ");
//               } 
//         } 
//         System.out.println();
// Count positive, negative, and zero.
        //  for(int i=0;i<arr.length;i++){
        //       if(arr[i]>=0){ 
        //         System.out.print("P");
        //       }else{
        //         System.out.print("N");
        //       }
        // } 
// Reverse print the array (array ko reverse mat karo, sirf ulta print karo).
// System.out.println();
//      System.out.print("Reverse Array:");
//      for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
// System.out.println();
// Linear Search
        // System.out.print("Target:");
        // int t = sc.nextInt(),a=0; 
        // for(int i=0;i<arr.length;i++){
        //     if(t == arr[i]){
        //         System.out.println("Yes:"+arr[i]);
        //     }else{
        //         a++;
        //     }
        // }
        // if(a==0){
        //     System.out.println("Present");
        // }{
        //     System.out.println("Not");
        // } 
        
        
// Count frequency 
int arr[]={1,2,2,2,4};

for(int i=0;i<arr.length;i++){
    int count = 1 ; 
    boolean AC = false;
    for(int j=0;j<i;j++){
               if(arr[i]==arr[j]){    
                  AC = true;
                  break;
                } 
            } 

             if(AC == true){
                continue;
                }
            
             for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){     
                count++;
            } 
        } 
        System.out.println(arr[i]+":"+count);  
        
        }
  

 
// Find second largest
// Find smallest

// Check duplicate

// int dupli=0,c=0;
// for(int i=0;i<arr.length;i++){ 
//         for(int j=i+1;j<arr.length;j++){ 
//                    if(arr[i]==arr[j]){
//                         c++;
//                          dupli= arr[i]; 
//                        }
//                     } 
//                 } 
//             System.out.println(dupli+":"+c);

//remove duplicate
// System.out.print("Without Duplicate:"); 
// for(int i=0;i<arr.length;i++){
//         boolean isV = false ;
//         for(int j=i+1;j<arr.length-1;j++){
//             if(arr[i]==arr[j]){  
//                 isV = true; 
//             }
//         } 
//         if(isV==false){
//         System.out.print(arr[i]+" "); 
//         }  
//     }



    }
 
}

//..................
class Solution {
    public int searchInsert(int[] nums, int target) {
        int j;
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
         }
       
      int target=3;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==target){
              System.out.println("T:"+i);
          }else{  
                    for( j=0;j<arr.length;j++){
                      if(target < arr[j]){ 
                        //   System.out.println("Index:"+ j);
                         break;
                        } 
                     } 
                       
             } 
          
      }
      return j;
    }
    
    
    public static void main(String[] args) {
     int nums[]={1,2,4,5},target=3;
     Solution s= new Solution();
     
     System.out.println( s.searchInsert(nums,target));
    }
    
}
//.............

class Main {
    
    static void fun(int n){ 
        if(n>1){
         System.out.println("Sheetal");
         fun(n-1);
        }
    } 
    public static void main(String[] args) { 
        
     int n=15; 
     fun(n);
 
    
    }
}