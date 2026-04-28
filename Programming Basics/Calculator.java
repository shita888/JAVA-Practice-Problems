public class Calculator{
public static void main(String args[]){

int a=2,b=4;
String op = "+" ;

if(op=="+")
{
   int sum = a+b;
   System.out.println("Sum: "+sum);
}
else if(op=="-")
{
      int min = a-b;
   System.out.println("Minus: "+min);
}
else if(op=="*")
{
   int mult = a*b;
   System.out.println("Mutiply: "+mult);
}
else 
{
   int Divide = a/b;
   System.out.println("Devide: "+Divide);
}

}
}
 
