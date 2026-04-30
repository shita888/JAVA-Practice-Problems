import java.util.Scanner;
public class BinarytoDecimal{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter num: ");
int n = sc.nextInt();
int rem , X,rev=0,count=1;
int p = 1,D=0;
while(n>0)
{
 
	rem = n%2;
	X = rem; 
	System.out.print(X);
	
	for(int j=1;j<=count;j++){
		p = p*j;
		D = X*p;
		 
	} 
        System.out.println(D);
        count++;
p = 2;
	n = n/2;
}
 

}
}