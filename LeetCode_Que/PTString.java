package LeetCode_Que;

public class PTString {
    public static void main(String[] args) {

// 1. Count Spaces

        // String s1 = "I am Shital";

        // char ch = s1.charAt(1);
        // int c=0;
        // for(int i=0;i<s1.length();i++){
        //     if(ch == s1.charAt(i)){
        //         c++;
        //     }
        // }
        // System.out.println(c);

// 2. Count Words in One Sentence

         // String s1 = "I love programming";
        // String s1="";

        // int c=0;
        // char ch ;
        // if(s1.isEmpty()){
        //     System.out.println("The given String is Empty!");
        // }else{
        //     ch = s1.charAt(1);
        //     c=1; 
        //     for(int i=0;i<s1.length();i++){
        //         if(ch == s1.charAt(i)){
        //             c++;
        //         } 
        //     }   
        // }
        // System.out.println("Total Words: "+c);

// 3. Count Vowels

        // String s1 = "Hello World";
        // System.out.println(s1);
        // int c=0;
        // for(int i=0;i<s1.length();i++){
        //     if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e'|| s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u' || s1.charAt(i) == 'A' || s1.charAt(i) == 'E'|| s1.charAt(i) == 'I'||s1.charAt(i) == 'O'||s1.charAt(i) == 'U'){
        //         c++;
        //     }
        // } 
        // System.out.println("No. of Vowels: "+c);

// 4. Count Uppercase Letters

        // String s1 = "Hello World"; 
        // System.out.println(s1);

        // String s2 = s1.toUpperCase();
        // System.out.println(s2);
        
        // int c=0;
        // for(int i=0;i<s1.length();i++){
        //     if(s1.charAt(i)>=65 && s1.charAt(i)<=90){
        //         c++;
        //     } 
        // } 
        // System.out.println("No. of Uppercase Letters: "+c);

// 5. Longest Word Length

        // String s1 = "Shital the great";
        // String s1 = "Its your not";
        // String s2=" ";
 
        // char ch ;
        // int n=0,m=0,m1=0,max=0;;
        // if(s1.isEmpty()){
        //     System.out.println("The given String is Empty!");

        // }else{
        //     ch = s2.charAt(0); 
        //     for(int i=0;i<s1.length();i++){ 
        //         if(ch == s1.charAt(i)){ 
        //             m=n;
        //             System.out.println(m+" ");
        //              if(max<m){
        //                 max = m;
        //                 }
        //             n=0;
        //         }else{ 
        //             n++;
        //             m1=n;
        //         }  
        //     }   
        //     System.out.print(m1+" "); 
        // }
        // if(max<m1){
        //     max = m1;
        // }

        // System.out.println("\nLongest Word Length: "+max);

// 6. Count Sentences Having More Than 3 Words

//    String[] arr = {
//     "I love Java",
//     "Java is very easy",
//     "Hello",
//     "Practice makes coding easy"
//     };

//     String s1 = " ";
//     char ch = s1.charAt(0); 
//     int n=0;
//     for(int i=0;i<arr.length;i++){
//         int c=1;
//         for(int j=0;j<arr[i].length();j++){ 
//             if(ch == arr[i].charAt(j)){
//               c++;
//             } 
//         }
//         if(c>3){
//             n++;
//         }
//         // System.out.print(c+" ");
//     }
//     // System.out.println();
//     System.out.println("Sentences Having More Than 3 Words: "+n);

// 7. Find Maximum Number of Spaces

    String[] arr = {
    "I love Java",
    "Java is easy to learn",
    "Hello"
    };

    String s1 = " ";
    char ch = s1.charAt(0);
    int max=0;
    int index=0;
    for(int i=0;i<arr.length;i++){
        int c=0;
        for(int j=0;j<arr[i].length();j++){
            if(ch==arr[i].charAt(j)){
                c++;
                if(max<c){
                    max = c; 
                    index = i;
                }
            }
        } 
        // System.out.println(c);
    }
    System.out.println("Max Space: "+max);
    System.out.println("Max Words: "+(max+1)); 
    System.out.println("Index: "+index);


    
    }
}
