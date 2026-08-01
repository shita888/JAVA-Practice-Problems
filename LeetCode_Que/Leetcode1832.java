package LeetCode_Que;

public class Leetcode1832 {
    // 97 - 122
    public static boolean checkIfPangram(String sentence) {
        String n = "123"; 
 
        return false; 

    }
    public static void main(String[] args) {
        // String sentence = "the quck";
        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // checkIfPangram(sentence);

        int x=8;
        int p=x;
         int n=1 ;
         while(p>0){
             p = p/2;
             if(p==1){
                 break;
                }
                n++;
            } 
            
        if(n%2==0){ 
             double result = x/2;
            System.out.println(result);
            int k = (int)result;
            return k;
        }else{
            double result = x/4;
            result = result*1.414;
            System.out.println(result);
            int k = (int)result;
            return k;
        }

    }
}
