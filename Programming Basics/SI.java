import java.util.Scanner;
public class SI{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
System.out.print("Enter P: ");
	int p = sc.nextInt();

System.out.print("Enter R: ");
	int r = sc.nextInt();

System.out.print("Enter T: ");
	int t = sc.nextInt();

	 int si = (p*r*t)/100;

System.out.print("Simple Interest: "+si);
 

}
}