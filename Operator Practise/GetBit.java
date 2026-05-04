import java.util.Scanner;
public class GetBit{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter binary num: ") ;
int n = sc.nextInt();

System.out.print("what bit you check: ") ;
int a = sc.nextInt();
int b = a-1;
int c= 1<<b;
 
 

int A = c&n;
System.out.print(A);
if(A==0){
System.out.print("Bit is 0");
}
else{
System.out.print("Bit is 1");
}


}
}