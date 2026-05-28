import java.util.Scanner;
public class BankAcc {
    Scanner sc = new Scanner(System.in);

    String AccHolder="Shital Narwariya";
    double balance = 25000; 
    void deposit(){
        System.out.print("Deposite:");
        int d = sc.nextInt();
        balance = balance + d;
    }
    void withdraw(){
        System.out.print("Withdraw:");
        int w = sc.nextInt();
        balance = balance - w;
        if(balance<0){
            System.out.println("error... not enough money in your account");
        }
    }
    void checkBalance(){
        System.out.println("Total Balance:"+balance); 
    } 
    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        b.checkBalance();
        b.deposit();
        b.withdraw();
        b.checkBalance();
    }

}
