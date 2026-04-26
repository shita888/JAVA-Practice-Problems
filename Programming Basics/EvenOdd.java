import java.util.Scanner;
public class EvenOdd{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
System.out.print("Enetr any num: ");	
int a = sc.nextInt();


if(a%2==0){
System.out.print(a+" is Even");	
}
else{
System.out.print(a+" is Odd");	
}


}
}
