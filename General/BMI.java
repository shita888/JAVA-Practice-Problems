import java.util.Scanner;
public class BMI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("* * * * * Calculate BMI * * * * * ");
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // System.out.print("Your are Femail[F] OR Mail[M]: ");
        // char ch = sc.next().charAt(0);
      
        System.out.print("Enter your Weigth: "); 
        int w = sc.nextInt();  

        System.out.print("Enter your Heigth in Feets: "); 
        float f = sc.nextFloat(); 
         float n1 = 0.3048f;
            float f1 = f*n1; 
 
        float BMI = (w / (f1*f1));
        System.out.println("BMI: "+BMI);

        float u1=18.5f,u2=24.9f;
        if(BMI<u1){
             System.out.println("OH! YOU ARE 'Under-Weigth'");
        }else if(u1<BMI && BMI<u2){
             System.out.println("WOW! YOU ARE 'Healthy-Weigth'");
        }else{
             System.out.println("OMG! YOU ARE 'Over-Weigth' Needs Excersize");
        }
    }
}
