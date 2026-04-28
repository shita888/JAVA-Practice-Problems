public class SwapUsingXOR{
public static void main(String args[])
{

int a = 2;
int b = 3;

int T;

T = a;
a = a^b^a;
b = T;

System.out.println(a+" " +b);
}
}