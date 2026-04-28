public class  Fibonacci{
public static void main(String args[]){

int n = 5;
int a=0, b=1; 
System.out.println(a+" ");
System.out.println(b+" ");

int t;
for(int i=2;i<n;i++)
{
 	t = a+b;
	a = b;
	b = t;
System.out.println(t); 
 }

}
}