import java.util.Scanner;
public class DecimaltoBinary{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter num: ");
int n = sc.nextInt();
int rem , X,rev=0;
while(n>0)
{
	rem = n%2;
	X = rem;
         rev = X + (rev*10);
	System.out.print(X);
	n = n/2;
}
 

}
}