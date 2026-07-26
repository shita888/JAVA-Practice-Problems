package LeetCode_Que;

import java.util.Arrays;

public class Leetcode628I {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4};
        // int arr[] =  {-1,-2,-3};

           int[] nums = {-8,-7,-1,10,20}; 

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > first) {

                third = second;
                second = first;
                first = nums[i];

            } else if (nums[i] > second) {

                third = second;
                second = nums[i];

            } else if (nums[i] > third) {

                third = nums[i];
            }
        }

        System.out.println("Largest = " + first);
        System.out.println("Second = " + second);
        System.out.println("Third = " + third);
    

        int Sfirst = Integer.MAX_VALUE;
        int Ssecond = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < Sfirst) {

                Ssecond = Sfirst;
                Sfirst = nums[i];

            } else if (nums[i] < Ssecond) {

                Ssecond = nums[i];
            }
        }

        System.out.println("Smallest = " + Sfirst);
        System.out.println("Second Smallest = " + Ssecond);

        int product1 = first * second * third;

        int product2 = Sfirst * Ssecond * first;
        int max = Math.max(product1, product2);
        System.out.println(max);
        // return  max;


// brute force.....
        // Arrays.sort(arr);
        // int n = 1;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         for(int k=j+1;k<arr.length;k++){
        //             n = arr[i]*arr[j]*arr[k];
        //             System.out.print(n+" ");
        //             if(max<n){
        //                 max = n;
        //             }
        //         }
        //     }
        // }
 
        // System.out.println(max);



    }
}
