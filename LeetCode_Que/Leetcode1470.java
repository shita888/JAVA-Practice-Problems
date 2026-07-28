package LeetCode_Que;

public class Leetcode1470 {
      public static int[] shuffle(int[] nums, int n) {
 
        int merg[] = new int [nums.length]; 
                    for(int i=0;i<nums.length;i++){
                    System.out.print(nums[i]+" ");
                } 
                System.out.println();

                int k=1;
                int n1=1;
              merg[0]=nums[0];
            for(int i=1;i<nums.length;i++){ 
                if(i%2==0){
                    merg[k++] = nums[n1++]; 
                }
                else{
                    merg[k++] = nums[n++];
                }
            } 
                
                for(int i=0;i<merg.length;i++){
                    System.out.print(merg[i]+" ");
                } 

 
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


        return merg;
 
}
 
    public static void main(String[] args) {
        // int nums[] = {2,5,1,3,4,7};
        int nums[] = { 7,5,9,7,5,8,10,4,3,3,2,5,9,10}; 
        int n=7;
        shuffle(nums,n);
 
    }
}
