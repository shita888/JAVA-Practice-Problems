import java.util.Scanner;

public class SwapNoThird{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
System.out.print("Enter value a: ");
         int a = sc.nextInt();
System.out.print("Enter value b: ");
	int b = sc.nextInt();
       
a = a+b;
b = a -b;
a = a-b;
System.out.print("a: "+a);
System.out.print("b: "+b);

}
}