package LeetCode_Que;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];

        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){ 
            int G = candies[i] + extraCandies;  
            if(G>=max){
                ans.add(true);
            }else{ 
                ans.add(false);
            }
        }

System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        // int candies[] = {2,3,5,1,3};
        // int extraCandies = 3;
        int candies[] = {4,2,1,1,2};
        int extraCandies = 1;
        kidsWithCandies(candies,extraCandies);
    }
}
