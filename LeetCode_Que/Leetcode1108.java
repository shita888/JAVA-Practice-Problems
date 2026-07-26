package LeetCode_Que;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1108 {
    //  public static String defangIPaddr(String address) {
    //     String m = address.replace(".","[.]");
    //     System.out.println(m);
    //     return m;
    // }
    // public static void main(String[] args) {
    //     String address = new String("1.1.1.1");
    //     defangIPaddr(address);
    // }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        return al;
    }
    public static void main(String[] args) {
        // int numRows = 5;
        // generate(numRows);


        int n =5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    System.out.print(1+" "); 
                }
                else{  
                     int t = (j-1)+j; 
                     System.out.print((i)+" ");
                }
            }
            System.out.println();
        }





    }
}
