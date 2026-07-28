package LeetCode_Que;

public class Leetcode1528 {
    public static String restoreString(String s, int[] indices) {

        // System.out.println(s.charAt(0));
        
        // for(int i=0;i<s.length();i++){ 
            //     for(int j=0;j<indices.length;j++){ 
                //         s1=s1+s.charAt(indices[j]);  
                //     }
                //     break;
                // }

                
        String s1="";
                
        char ch[] = new char[s.length()];
        for(int i=0;i<s.length();i++){ 
            for(int j=0;j<indices.length;j++){ 
                ch[indices[i]]=s.charAt(i); 
            }  
        }
        for(int i=0;i<ch.length;i++){
           s1=s1+ch[i];
        }
        System.out.println(s1);
 
        return s1;
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        restoreString(s,indices);
    }
}
