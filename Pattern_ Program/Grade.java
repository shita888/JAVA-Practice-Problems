// Q1. Grade Calculator using Decision Control Statement
// Write a Java program to accept marks of a student and display the grade according to the following conditions:
// • Marks ≥ 90 → Grade A
// • Marks ≥ 75 and < 90 → Grade B
// • Marks ≥ 50 and < 75 → Grade C
// • Marks < 50 → Fail
import java.util.Scanner;
import java.util.regex.Pattern;

public class Grade{
   
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks:");
        // int m = sc.nextInt();

        // if(m>=90){
        //       System.out.println("Grade A");
        // }else if(m>=70 && m<90){
        //     System.out.println("Grade B");
        // }else if(m>=50 && m<75){
        //     System.out.println("Grade C");
        
        // }else{
        //     System.out.println("Fail");
        // }


// Pattern Printing using Nested Loop

// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// Reverse Number using Loop
// int rem ,rev =0;
// int n =123;
// while(n>0){
//     rem = n%10;
//     rev = rem+(rev*10); 
//     n = n/10;
// }
// System.out.print(rev);

// Q7. Number Guessing Game using Decision Statement and Loop
// Write a Java program that stores a secret number (for example 25). Ask the user to guess the number repeatedly
// until the correct number is entered.
// Display:
// • “Too High” if guess is greater
// • “Too Low” if guess is smaller
// • “Correct Guess” when the number matches
// Use loop and decision control statements.

System.out.println("Guess The Num: ");
        int p = sc.nextInt();
int g = 25;
        while(p>0){
            if(g<p){
                System.out.println("Too High");
                break;
            }else if(g>p){
                System.out.println("Too Low");
                 break;
            }else{
                System.out.println("Congratulation! YOU WIN");
                break;
            }
        }

// Q4. Prime Number Check
// Write a Java program to check whether a given number is prime or not using loop and decision control
// statements.

int k = 2;



    }
}