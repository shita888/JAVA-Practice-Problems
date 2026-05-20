package SmallProjects;
import java.util.Scanner;
public class ATMSystem 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int PIN ,pin = 123456;;
        do{
        System.out.print("Enter Your PIN: ");
         PIN = sc.nextInt();
          
            if(PIN==pin){
                  System.out.println("* * * MANU * * *");
                  System.out.println("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Exit");
                    System.out.print("Enter Your choise: ");
                   int choise = sc.nextInt();
                if(choise==1){
                            System.out.println("Balance: $50000");
                            break;
                    }else if(choise==2){
                            System.out.println("Deposite: $1500");
                            break;
                     }else if(choise==3){
                            System.out.println("Withdraw: $1000");
                            break;
                     }else if(choise==4){
                            System.out.println("Exit");
                            break;
                     }else{
                            System.out.println("Invalid Choise");
                            break;
                   }

            }else{
            System.out.println("Invalid PIN Try Again...");
            }
        }while(PIN!=pin);


    }
}

