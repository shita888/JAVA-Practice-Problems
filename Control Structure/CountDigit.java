public class CountDigit{
public static void main(String args[])
{

int a = 245,rem;
int count = 0;
      while(a>0){
	rem = a%10;
	a = a/10;
	count++;
       }
System.out.println(count);
}
}