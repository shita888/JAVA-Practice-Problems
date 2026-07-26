package LeetCode_Que;

import java.util.Arrays;

public class Leetcode628 { 
        public static int maximumProduct(int[] nums) {
            
        // System.out.println(nums.length);
        int neg=nums[0],v=0,p=0;
        for(int i=0;i<nums.length;i++){ 
            if(neg == nums[i]){
                v++;
            }
            if(nums[i]>0){
                p++;
            }
        }

        // System.out.println(v);
        // System.out.println(mag);

    // if(p==nums.length){
    //             System.out.println("no");
    //               int count=0;
    //         int mult=1;
    //         int s=0;
    //         int m=Integer.MIN_VALUE;
    //         while(s!=nums.length-1){ 
    //             int n=1;
    //             int e=nums.length-1;
    //             while(s<e){ 
    //                 n = nums[s]*nums[e];
    //                 // System.out.println(n);
                                            
    //                 e--; 
    //                 if(m<n){
    //                     m = n;
    //                 }
    //             }
    //             s++; 
    //         } 
    //         System.out.println(m);
             

    //     if(m!=0){

    //         int s1=0,g=0,h=0; 
    //         while(s1!=nums.length-1){  
    //             int e=nums.length-1;
    //             while(s1<e){ 
    //                 if(m==nums[s1]*nums[e]){
    //                 System.out.println(nums[s1]);
    //                 System.out.println(nums[e]);
    //                     g=nums[s1];
    //                     h=nums[e];
    //                 }
    //                 e--;  
    //             }
    //             s1++; 
    //         } 
        
    //         int x = Integer.MIN_VALUE;
    //         int y = x;
    //         for(int i=0;i<nums.length;i++){
    //             if(nums[i]!=g && nums[i]!=h){
    //                 x = m*nums[i];
    //                 if(y<x){
    //                     y = x;
    //                 }
    //             }
    //         }
    //         System.out.println(y);
    //         return m;
    //     }
    //     else{
    //         return 0;
    //     } 
    // }
    


    if(v==nums.length ){ 
          Arrays.sort(nums);
        System.out.println("yes");
            int s=0;
            int count=0;
            int mult=1;
            int m=Integer.MIN_VALUE;
            while(s!=nums.length-1){ 
                int n=1;
                int e=nums.length-1;
                while(s<e){ 
                    n = nums[s]*nums[e];
                    System.out.println(n);  
                                    for(int i=0;i<nums.length;i++){
                                        if(nums[i]!=nums[s] && nums[i]!=nums[e]){
                                                mult = n*nums[i];
                                                count++;

                                        }
                                    }
                                    if(count==0){
                                        mult = n*nums[s];
                                    }
                                    //  System.out.println(mult); 
                    e--;  
                    if(m<mult){
                        m = mult;
                    }
                }
                s++; 
            } 
            System.out.println(m);
            // System.out.println(count);
    return m;

        }else{

  Arrays.sort(nums);
  for (int i = 0; i < nums.length ; i++) {System.out.print(nums[i]+" ");}

             int count=0;
            int mult=1;
            int s=0;
            int m=Integer.MIN_VALUE;
            while(s!=nums.length-1){ 
                int n=1;
                int e=nums.length-1;
                while(s<e){ 
                    n = nums[s]*nums[e];
                    // System.out.println(n);
                                    for(int i=0;i<nums.length;i++){
                                        if(nums[i]!=nums[s] && nums[i]!=nums[e]){
                                                mult = n*nums[i];
                                                count++;

                                        }
                                    }
                                    if(count==0){
                                        mult = n*nums[s];
                                    }         
                    e--; 
                    if(m<mult){
                        m = mult;
                    }
                }
                s++; 
            } 
            System.out.println(m);
            if(m==0){
                return 0;
            }else{
                return m;
            }
 
        
        }
        
    

        

        }
    public static void main(String[] args) {
        // int nums[] = {-8,-7,-2,10,20};
        // int nums[] = {-1000,-1000,-1000};
        // int nums[] = {9,1,5,6,7,2};
        // int nums[] = {6,2,6,5,1,2};
        int nums[] = {1,1,1,1,2,2,2,3,3,3};
        // int nums[] = {1,2,3,4};
        // int nums[] = {0,0,0};
        // int nums[] = {-100,-98,-1,2,3,4};
        maximumProduct(nums);
        
    }
}
 