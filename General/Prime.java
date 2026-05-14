import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count=0;
         System.out.println("Enetr num:");
         int n = sc.nextInt();

        for(int i=2;i<n;i++){
            if(n%i==0){
                
                count++;
            } 
        }

        if(count==1){
               System.out.println("Not prime");
        }else{
              System.out.println(" prime");
        }

    }
}
