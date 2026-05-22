package Arrays_Practise;
import java.util.Arrays;
import java.util.Scanner;
public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Q1. Array Print
        // int arr[]={10,20,30,40,50};

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

// Q2. Sum of Array
// int sum=0;
//          for(int i=0;i<arr.length;i++){
//              sum=sum+arr[i];
//         }
        // System.out.println("Sum: "+sum);

// Q3. Largest Element
// int arr[]={1,1,2,4,7,8};
 
        // for(int i=0;i<arr.length;i++){ 
        //     for(int j=0;j<arr.length-1;j++){
        //         if(arr[j]>arr[i]){
        //             int tem = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = tem;
        //         }
        //     }
        // }

//         System.out.print("Array:");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     int brr[]=new int[arr.length];
//  for(int i=0;i<arr.length;i++){
//             brr[i]=arr[i];        
//         }

        // System.out.println("Largest ele: "+arr[arr.length-1]);
        // System.out.println("Second Largest ele: "+arr[arr.length-2]);
        // System.out.println("Third Largest ele: "+arr[arr.length-3]);

//Q4. Search Element

//    System.out.print("Search Ele: ");
//    int n = sc.nextInt();
//    int p=0;
//    for(int i=0;i<arr.length;i++){
//              if(n==arr[i]){
//                 System.out.println("Present:"+arr[i]);
//                 p++;
//                 break;
//              } 
//         }
//         if(p==0){
//             System.out.println("Not Present");
//         }
// System.out.println();
//Q5. Count Even Numbers
// int count=0;
    //    for(int i=0;i<arr.length;i++){
    //        if(arr[i]%2==0){
            // System.out.println("Even: "+arr[i]);
    //         count++;
    //        }
    //    }
    //    System.out.println("Total Even: "+count);


// Q6. Reverse Array Print

    //   System.out.print("Re_Array: ");
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }


// Q8. Average of Array
// int ave=0;
 
//         for( int i=0;i<arr.length;i++){
//             ave = sum/arr.length;
//         }
//         System.out.println("\nAve_Array: "+ave);

// Q10. Count Positive and Negative Numbers
// int p=0,n=0,z=0;
//         for( int i=0;i<arr.length;i++){
//              if(arr[i]>0){
//                 p++;
//              }else if(arr[i]<0){
//                  n++;
//              }else{
//                 z++;
//              }
//         }
        // System.out.println("Positive: "+p);
        // System.out.println("Negative: "+n);
        // System.out.println("    Zero: "+z);

// Q11. Check Array is Sorted or Not

// for(int i=0;i<arr.length;i++){ 
//             for(int j=0;j<arr.length-1;j++){
//                 if(arr[j]>arr[i]){
//                     int tem = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = tem;
//                 }
//             }
//         }

         
//  System.out.print("Array:");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
 
//         int l=0;
//  for(int i=0;i<arr.length;i++){
//            if(brr[i]!=arr[i]){
//               System.out.println("\nNot Sorted");
//               break;
//            }else{
//                 l++;
//            }
//         }

//         if(l!=0){
//             System.out.println("\nSorted");
//         }


//Q12. Find Duplicate Elements

// int arr[] = {1,2,3,2,5,1,5};
// int h=0;
//     System.out.print("Array:");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
 
    // System.out.println("\nDuplicate Value:");
    //     for(int i=0;i<arr.length;i++){ 
    //         for(int j=i+1;j<arr.length;j++){
    //           if(arr[i]==arr[j]){
    //              System.out.println(arr[i]);
    //           }
    //         }
    //     }
    
// Q13. Merge Two Arrays

// int arr[] = {1,2,3};
 
//     System.out.print("Array1: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
// System.out.println();
// int brr[] = {4,5,6};
 
//     System.out.print("Array2: ");
//         for(int i=0;i<brr.length;i++){
//             System.out.print(brr[i]+" ");
//         }

//     // int crr[] = new int[brr.length]; 
 
// System.out.println();

// System.out.print("Array3: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//          for(int i=0;i<brr.length;i++){
//             System.out.print(brr[i]+" ");
//         }



//Q14. Frequency of Each Element.
// Har element kitni baar aaya hai print karo.

int arr[] = {1,2,3,2,5,1,5}; 

    System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
    System.out.println("\nDuplicate Value:");
        for(int i=0;i<arr.length;i++){ 
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                 System.out.println(arr[i]);
              }
            }
        }

  System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
