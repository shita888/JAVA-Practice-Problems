import java.util.Scanner;

public class p1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String s = sc.next();
        // System.out.println(s);

//         String s = "Java Developer";
//         System.out.println(s);
//         // System.out.println("Length:"+s.length());

//         for(int i=0;i<s.length();i++){
//             System.out.print(s.charAt(i)+" ");
//         }
// System.out.println();
//         for(int i=s.length()-1;i>=0;i--){
//             System.out.print(s.charAt(i)+" ");
//         }

        String s = "madam";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            for(int j=s.length()-1;j>=0;j--){
            System.out.print(s.charAt(j));
            }
            System.out.println();
        } 
          
         



    }
}
