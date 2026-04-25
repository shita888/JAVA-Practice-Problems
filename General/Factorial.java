public class Factorial{
 
   
public static int fact(int n)
{
  int sum = 1;
     for(int i=1;i<=n;i++)
         {
           sum = sum*i;
         }
      System.out.println(sum);
return sum;
}

public static void main(String[] args){
 
       fact(5);
}

}