package LeetCode_Que;

public class Leetcode1920 {
    public static void main(String[] args) {
        int arr[] = {0,2,1,5,3,4};
        int brr[] = new int [arr.length];

        for(int i=0;i<arr.length;i++){ 
            brr[i] = arr[arr[i]];
        }

        for(int i=0;i<brr.length;i++){ 
         System.out.println(brr[i]); 
        }
    }
}
