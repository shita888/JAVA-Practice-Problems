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

//..........................
class Main {
    public static void main(String[] args) {
         String s1[] ={"flower","flow","flight"};  
         String ans = "";     
         
        for(int i=0;i<s1.length;i++){
        //   for(int j=0;j<s1[i].length();j++){  
            int k=0;
           while(k==0){ 
                System.out.println(s1[i].charAt(k)); 
                k++;
            }
              
            //  }
                
        }
    }
  //......................
  class Main {
    public static void main(String[] args) {
         String s1[] ={"flower","flow","flight"};  
         String s = s1[0];    
         String ans = ""; 
         for(int i=0;i<s1.length;i++){
             for(int j=0;j<s1[i].length();j++){
                if(s.length()>s1[i].length()){
                    s = s1[i];
                }
             }
         }
         System.out.println(s);  
         int index=0;
         for(int i=0;i<s1.length;i++){
             if(s == s1[i]){
                 index = i;
             }
         }
           
           
    for(int i=0;i<s1.length;i++){ 
    int  k=i;
        for(int j=0;j<s.length();j++){ 
                 while(k==i){  
                     if(s1[index].charAt(k) == s1[i].charAt(k)){
                     System.out.println(s1[i].charAt(k));  
                     ans = ans+s1[i].charAt(k);
                     k++; 
                 }
                 }
           } 
        } 
            System.out.println(ans); 
     
        
    }
}