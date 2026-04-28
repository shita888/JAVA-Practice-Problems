public class Expression{
public static void main(String args[]){

int a=1 , b=1 , c=2;

int p = 1;
int p1 = 1;
for(int i =1 ; i<=2; i++)
{
	p = p*a;
	p1 = p1*b;
}

double d = c/2;
double result = p+p1+(2*a*b)+d;

System.out.println(result);
}
} 