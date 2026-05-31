package SunnySirProjects;
import java.util.Scanner;
 
public class Account {
    Scanner sc = new Scanner(System.in);
    int accountNumber ;
    String customerName ;
    String branchName ;
    double balance ; 


    void createAccount(){
        System.out.println("Create Your Account:");

          System.out.print("Enter Customer Name:");
          customerName = sc.nextLine();

          System.out.print("Enter BranchName:");
        branchName = sc.nextLine();

        System.out.print("Enter Account Number:");
          accountNumber = sc.nextInt();

          System.out.print("Enter balance:");
          balance = sc.nextDouble(); 

       

         
    }

    void deposit(){
         System.out.print("\nDepodit Amount:");
         double amt=sc.nextDouble();
         balance = balance + amt;
    }
    void  withdraw(){
        System.out.print("\nWithdraw Amount:");
         double amt=sc.nextDouble();
          balance = balance - amt;
    }
    void displayAccount(){
         System.out.println("\nYour Account Details:");

        System.out.println("Account Number:"+accountNumber); 

        System.out.println("Customer Name:"+customerName); 

        System.out.println("Branch Name:"+branchName); 

        System.out.println("Total Balance:"+balance);  
    }

    public static void main(String[] args) {

      SavingsAccount s = new SavingsAccount();
      s.createAccount();
      s.displayAccount();
        s.calculateInterest();
        s.checkMinimumBalance();
        s.displaySavingsInfo();

            LoanAccount l = new LoanAccount();
            l. calculateEMI();
            l.payEMI();
            l.displayLoanInfo();
    }

} 


class SavingsAccount extends Account{
    double interestRate = 6.5;
    double minimumBalance = 10000;
     double CI;
 

    void calculateInterest(){ 
         CI = balance * interestRate/100; 
        System.out.println("Interest: "+CI);
 
    }
    void checkMinimumBalance(){
        if(balance<=minimumBalance){
            System.out.println("Inificint Balance");
        } 

    }
    void displaySavingsInfo(){
        System.out.println("\nSavings Info:");
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Calculated Interest: "+CI);
        System.out.println("MinimumBalance: "+minimumBalance);
    }
}


class LoanAccount extends Account{
    double loanAmount = 500000;
    double interestRate = 8.5;
    int loanDuration = 5;
    int EMI;

    void calculateEMI(){
      EMI = 10258;
    //    System.out.println("Monthly EMI: "+EMI);
 
    }
    void payEMI(){ 
 
        loanAmount = loanAmount- EMI;
        System.out.println("Remaining loanAmt: "+loanAmount);


    }
    void displayLoanInfo(){
        System.out.println("\nLoan Info:");
        System.out.println("loanAmount: "+loanAmount);
        System.out.println("interestRate: "+interestRate);
        System.out.println("Duration: "+loanDuration);
        System.out.println("EMI: "+EMI);
    }
}


 