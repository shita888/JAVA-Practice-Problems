package LeetCode_Que;

public class Leetcode2114 {
    public static int mostWordsFound(String[] sentences) {
        //  System.out.println(sentences[0].charAt(5));
        //  System.out.println(sentences[0].indexOf(" "));
        //  System.out.println(sentences[0].length());
 

 
        // for(int i=0;i<sentences.length;i++){ 
           

        // } 
        return 1;
    }
    public static void main(String[] args) {
        // String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        // String[] sentences = {"please wait", "continue to fight", "continue to win"};
        // mostWordsFound(sentences);


        String s = "This is leetcode"; 

        
        char ch = s.charAt(4);    
        int count=0;
        for(int i=0;i<s.length();i++){  
             
            if(ch==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);


    }
}
