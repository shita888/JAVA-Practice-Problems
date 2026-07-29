package LeetCode_Que;

public class Leetcode1678 {
    public static void main(String[] args) {
        String command = "G()(al)";
         String  c = new String(command); 
        System.out.println(c);
        c.replace("()", "o");
        c.replace("(al)", "al");
        
        System.out.println(c);
    }
}
