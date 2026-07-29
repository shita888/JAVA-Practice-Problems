package LeetCode_Que;

public class Leetcode58 {
    public static void main(String[] args) {
        String s = "Hello World is";
        String s1 = " ";
        char ch= s1.charAt(0);
        int c = 0;
        int n = 0,m=0;
        for(int i=0;i<s.length();i++){
            if(ch == s.charAt(i)){
                c++;
                n=0;
            }else{ 
                n++;
                m=n;
            }
        }
        System.out.println(m);
        // System.out.println("Space: "+c);
        // System.out.println("Words: "+(c+1));



    }
}
