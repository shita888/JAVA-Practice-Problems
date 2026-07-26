package LeetCode_Que;

public class Leetcode1470 {
      public static int[] shuffle(int[] nums, int n) {

//         int a[] = new int[n];
//         int b[] = new int[n];
//         // int merg[] = new int [a.length + b.length]; 

// if(n%2==0){
//     for(int k=1;k<=n/2;k++){

//         System.out.println("start");
//         a[0] = nums[0];
//         int c=0;
//         int c1=1;
//          for(int i=1;i<nums.length;i++){
//               if(i%2!=0){
//                  b[c++] = nums[i];
//               }else{
//                 a[c1++] = nums[i];
//               }
//          }

//                 for(int i=0;i<a.length;i++){
//                       System.out.print(a[i]+" ");
//                 } 
//                 System.out.println();
//                 for(int i=0;i<b.length;i++){
//                       System.out.print(b[i]+" ");
//                 }  
//         System.out.println();
//         int c2=0; 
//                 for(int i=0;i<a.length;i++){
//                         nums[c2++]=a[i];
//                 } 
//                 for(int i=0;i<b.length;i++){
//                         nums[c2++]=b[i];
//                 } 

                
//                 for(int i=0;i<nums.length;i++){
//                     System.out.print(nums[i]+" ");
//                 }
//             }


//         return nums;
// }else{



//     for(int k=1;k<=n;k++){

//         System.out.println("start");
//         a[0] = nums[0];
//         int c=0;
//         int c1=1;
//          for(int i=1;i<nums.length;i++){
//               if(i%2!=0){
//                  b[c++] = nums[i];
//               }else{
//                 a[c1++] = nums[i];
//               }
//          }

//                 for(int i=0;i<a.length;i++){
//                       System.out.print(a[i]+" ");
//                 } 
//                 System.out.println();
//                 for(int i=0;i<b.length;i++){
//                       System.out.print(b[i]+" ");
//                 }  
//         System.out.println();
//         int c2=0; 
//                 for(int i=0;i<a.length;i++){
//                         nums[c2++]=a[i];
//                 } 
//                 for(int i=0;i<b.length;i++){
//                         nums[c2++]=b[i];
//                 } 

                
//                 for(int i=0;i<nums.length;i++){
//                     System.out.print(nums[i]+" ");
//                 }
//             }


        return nums;
    // }
}
 
    public static void main(String[] args) {
        // int nums[] = {2,5,1,3,4,7};
        int nums[] = { 7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        // int nums[] = {1,2,3,4,4,3,2,1};
        int n=7;
        // shuffle(nums,n);


        int a[] = new int[n];
        int b[] = new int[n];
        int merg[] = new int [a.length + b.length]; 
 
        System.out.println("start"); 
        int c=0;
        int c1=0;
         for(int i=0;i<nums.length;i++){
              if(i<n){
                 a[c++] = nums[i];
              }else{
                b[c1++] = nums[i];
              }
         }

                for(int i=0;i<a.length;i++){
                      System.out.print(a[i]+" ");
                } 
                System.out.println();
                for(int i=0;i<b.length;i++){
                      System.out.print(b[i]+" ");
                }  

        System.out.println();

        // problem.....
        for(int l=1;l<merg.length;l++){
             
            merg[0]=a[0]; 
            int c2=1;
            for(int i=1;i<a.length;i++){
              if(i%2==0){ 
                merg[c2++]=a[i];
              } 
            }
            
            nums[n]=b[0];
              int c3=n+1; 
            for(int i=1;i<b.length;i++){
                if(i%2!=0){ 
                    nums[c3++]=b[i];
                    }
               } 
        } 
 
 //////////
                
                for(int i=0;i<merg.length;i++){
                    System.out.print(merg[i]+" ");
                } 
     
         

    }
}
