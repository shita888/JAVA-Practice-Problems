import java.util.Scanner;
public class ClearBit{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter binary num: ") ;
int n = sc.nextInt();

System.out.print("convert 1 into 0: ") ;
int a = sc.nextInt();
int b = a-1;
int c= 1<<b;
 
int B = ~c;
int A = B&n;
 System.out.print(A);
 


}
}