package LeetCode_Que;

public class Leetcode1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for(int i=0;i<word1.length;i++){
             a = a+word1[i];
        }
        for(int i=0;i<word2.length;i++){
             b = b+word2[i];
        }
        System.out.println(a);
        System.out.println(b);

        if(a.equals(b)){
            System.out.println("True");
            return true;
        }else{ 
            System.out.println("False");
            return false;
        }
    }
    public static void main(String[] args) {
        String word1[] = {"ab", "c"};
        String word2[] = {"a", "bc"};
        arrayStringsAreEqual(word1,word2);
    }
}
