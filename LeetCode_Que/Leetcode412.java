package LeetCode_Que;

import java.util.ArrayList;
import java.util.List;

public class Leetcode412 {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int i=1;
        while(i<=n){
            if(i%3==0 && i%5==0){
                ans.add("FizzBuzz");
            }else if(i%3==0){
                ans.add("Fizz");
            }else if(i%5==0){
                ans.add("Buzz");
            }else{ 
                // String o = ""+1;
                ans.add(""+i);
            }
            i++;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        fizzBuzz(n);

    }
}
