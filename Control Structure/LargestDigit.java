import java.util.Scanner;
public class LargestDigit {
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

//System.out.print("Enter num: ");
//int n = sc.nextInt(); 

int n = 1234,rem=0;
while(n>0)
{
	rem = n%10;
 
        System.out.print(rem+" ");
        
	n = n/2;
}
 

}
}