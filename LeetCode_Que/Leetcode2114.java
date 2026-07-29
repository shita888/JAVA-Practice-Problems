package LeetCode_Que;

public class Leetcode2114 {
    public static int mostWordsFound(String[] sentences) {  

    String s1 = " ";
    char ch = s1.charAt(0);
    int max=0;
    int index=0;

    for(int i=0;i<sentences.length;i++){
        int c=0;
        for(int j=0;j<sentences[i].length();j++){
            if(ch==sentences[i].charAt(j)){
                c++;
                if(max<c){
                    max = c; 
                    index = i;
                }
            }
        } 
        // System.out.println(c);
    }
    // System.out.println("Max Space: "+max);
    System.out.println("Max Words: "+(max+1)); 
    // System.out.println("Index: "+index);

        return (max+1);
    }
    public static void main(String[] args) {
        // String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        mostWordsFound(sentences); 


    }
}
