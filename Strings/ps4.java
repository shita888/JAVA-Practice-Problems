class Solution {
    public static String longestCommonPrefix(String[] s1) {
    int p=0;
      String ans = "";
        for(int i=0;i<s1[0].length();i++){
          for(int j=i;j<s1[1].length();j++){
            for(int k=i;k<s1[2].length();k++){
             
                   if(i==j && j==k) { 
                       if(s1[0].charAt(i)==s1[1].charAt(j) && s1[1].charAt(j)==s1[2].charAt(k)){
                         ans = ans + s1[0].charAt(i);
                       }
                        
                    }
                else{ 
                        p++; 
                        break;
                    } 
            }
        }
    }
    
      if(p==0){
        System.out.println("No Common Prifix");
      }
     return ans;
  }
    
    public static void main(String[] args) {
        String s1[] ={"flower","flow","flight"};  
         System.out.println( longestCommonPrefix(s1));
    }
}