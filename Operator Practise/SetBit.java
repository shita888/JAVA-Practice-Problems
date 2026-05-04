import java.util.Scanner;
public class SetBit{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter binary num: ") ;
int n = sc.nextInt();

System.out.print("Convert bit 0 into 1: ") ;
int a = sc.nextInt();
int b = a-1;
int c= 1<<b;

System.out.println("After: "+(n|c));


}
}