package SmallProjects;
import java.util.Random;
import java.util.Scanner; 
public class NumGuess 
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
        System.out.println("\n* * * *WELCOME to Number Guessing Game* * * *\n");

        int r =  rand.nextInt(100);
        int n,count=0;
        do{
            System.out.print("Guess the Num: ");
            n = sc.nextInt();

            if(n>r){
                System.out.println("Too High..."); 
            }else if(n<r){
                System.out.println("Too Low..."); 
            }else{
                System.out.println("\n* * *Congretulation You WIN!* * *");
                break;
            }
            count++;
        }while(n!=r);

        System.out.println("      Total Attempts: "+count);

         
    }
}
