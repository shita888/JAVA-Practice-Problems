import java.util.Scanner;
public class Demo{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num: ");
int a = sc.nextInt();
System.out.print("Enter b num: ");
int b = sc.nextInt();
int c= a^b;
 
System.out.print(c);
}
}