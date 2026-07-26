package LeetCode_Que;

public class Leetcode88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int c=0;

    if(m!=0){
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){ 
                arr[c++] = nums1[i];
            }
        }
    }
    if(n!=0){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=0){ 
                arr[c++] = nums2[i];
            }
        }
    }



     for(int i=0;i<arr.length;i++){
            //  nums1[i]=arr[i];
            System.out.print(arr[i]+" ");
        } 

 
System.out.println();
    for (int i = 0; i < arr.length-1 ; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
       }
   }
        for(int i=0;i<arr.length;i++){
            //  nums1[i]=arr[i];
            System.out.print(arr[i]+" ");
        } 
   return arr;

    }
    public static void main(String[] args) {
        int nums1[] = {4,5,6,0,0,0};
        int m = 3;
        int nums2[] = {1,2,3};
        int n = 3; 
        merge(nums1,m,nums2,n);
    }
}
