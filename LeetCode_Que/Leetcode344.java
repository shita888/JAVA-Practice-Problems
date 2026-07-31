package LeetCode_Que;

public class Leetcode344 {
    public static void reverseString(char[] s) {
//Approach 1.........
        // char r[] = new char[s.length];
        // int j=0;
        // for(int i=s.length-1;i>=0;i--){
        //     r[j] = s[i];  
        //     j++;
        // }  
        // for(int i=0;i<r.length;i++){ 
        //     s[i] = r[i];
        // }
        // System.out.println();
        // for(int i=0;i<s.length;i++){ 
        //     System.out.print(s[i]+" ");
        // }

//Approach 2.........

        int st = 0;
        int ed = s.length-1;
        while(st<ed){
            char temp = s[st];
            s[st] = s[ed];
            s[ed] = temp; 
            st++;
            ed--;
        }
        for(int i=0;i<s.length;i++){ 
            System.out.print(s[i]+" ");
        }

    }
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
    }
}
