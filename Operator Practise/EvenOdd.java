import java.util.Scanner;
public class EvenOdd{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a Num: ");
	int n = sc.nextInt();
	int rem;
	System.out.println("Number: "+n);
        System.out.print("Binary: ");
     int t = n;
	while(n>0){
	rem = n%2;
	System.out.print(rem+" ");
        if(t%2==0){
		if(rem==0)
		{
		System.out.print(1);
		}else{
		System.out.print(0);
		}
	} 
 
	n=n/2;
	} 

}
}