import java.util.Scanner;
public class ps3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Concate..........
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+" "+s2;
        // System.out.println(s3);

    //Length.........
        // System.out.println(s1.length());
        // System.out.println(s2.length());
        // System.out.println(s3.length());

    //charAt..........
    
    // for(int i=0;i<s1.length();i++){
    //         System.out.println(s1.charAt(i));
    //     }
    // for(int i=s1.length()-1;i>=0;i--){
    //         System.out.println(s1.charAt(i));
    //     }
// leetcode 13..........
    int I = 1;
    int V = 5;
    int X = 10;
    int L = 50;
    int C = 100;
    int D = 500;
    int M = 1000;
        
    System.out.print("Enter Romen:");
    String str = sc.next();

    int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
    for(int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i));
            if(str.charAt(i)=='I'){
                System.out.println("I = "+I);
                 a++;
            }else if(str.charAt(i)=='V'){
                 System.out.println("V = "+V);
                b = b+5;
                 if(a<b && a!=0){
                    b = b-a-1;
                 }
            }else if(str.charAt(i)=='X'){
                System.out.println("X = "+X);
                c = c+10;
                if(a<c && a!=0){
                    c = c-a-1;
                 }
            }else if(str.charAt(i)=='L'){
                System.out.println("L = "+L);
                d = d+50;
                if(c<d && c!=0){
                    d = d-c-10;
             }
            }else if(str.charAt(i)=='C'){
                System.out.println("C = "+C);
                e = e+100;
                if(c<e && c!=0){
                    e = e-c-10;
                 }
            }else if(str.charAt(i)=='D'){
                System.out.println("D = "+D);
                f = f+500;
                if(e<f && e!=0){
                    f = f-e-100;
                 }
            }else{
                System.out.println("M = "+M);
                g = g+1000;
                if(e<g && e!=0){
                    g = g-e-100;
                 }
            }
 
            
            int Int = a+b+c+d+e+f+g;
            System.out.println(Int);

        }


    }
}
