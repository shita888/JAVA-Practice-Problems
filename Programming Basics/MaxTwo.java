import java.util.Scanner;
public class MaxTwo{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

System.out.print("Enetr a num: ");	
int a = sc.nextInt();
System.out.print("Enetr b num: ");	
int b = sc.nextInt();

if(a>b){
System.out.print(a+" is large");	
}
else{
System.out.print(b+" is large");	
}


}
}