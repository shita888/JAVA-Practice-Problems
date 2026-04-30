import java.util.Scanner;
public class GCD{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter 1st num: ");
int a = sc.nextInt();
System.out.print("Enter 1st num: ");
int b = sc.nextInt();

for(int i=a;i>=1;i--)
{
 //System.out.print(i+" ");

   if(a%i==0 && b%i==0)
   {
     System.out.print(i+" is GCD");
      break;
   }
 
}


}
}