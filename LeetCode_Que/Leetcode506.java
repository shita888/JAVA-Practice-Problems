package LeetCode_Que;

import java.util.Arrays;
import java.util.Collections;

public class Leetcode506 {
    public static String[] findRelativeRanks(int[] score) {
        System.out.println("Length: "+score.length);
        Integer arr[] = new Integer[score.length];
        String srr[] = new String[score.length];
        
        for(int i=0;i<score.length;i++){
            arr[i] = score[i];
        }

        Arrays.sort(score);

        int m1=score[0];
        int m2=score[0];
        int m3=score[0];

        for(int i=0;i<score.length;i++){
            if(m1<score[i]){
                m1 = score[i];
            }
        }
        // System.out.println(m1);
        for(int i=0;i<score.length;i++){
            if(m2<score[i] && score[i]<m1){
                m2 = score[i];
            }
        }
        // System.out.println(m2);
        for(int i=0;i<score.length;i++){
            if(m3<score[i] && score[i]<m1 && score[i]<m2){
                m3 = score[i];
            }
        }
        // System.out.println(m3);

         
        for(int i=0;i<arr.length;i++){ 
            if(arr[i] == m1){
                srr[i] = "Gold";
            }
            else if(arr[i] == m2){
                srr[i] = "Silver";
            }
            else if(arr[i] == m3){
                srr[i] = "Bronze";
            }
        }

            // int c=0;
            // Arrays.sort(arr,Collections.reverseOrder());  
            // for(int j=0;j<arr.length;j++){
            //     c++;
            //     if(arr[j]!=m1 && arr[j]!=m2 && arr[j]!=m3){   
                    // srr[j] = Integer.toString(c);   
            //         System.out.println(c); 
            //       }
            //     }  

        for(int i=0;i<srr.length;i++){
            System.out.println(srr[i]);
        }  
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
        }  
        return srr;
    }
    public static void main(String[] args) {
        // int score[] = {5,4,3,2,1};
        int score[] = {10,3,8,9,4};
        findRelativeRanks(score);
    }
}
