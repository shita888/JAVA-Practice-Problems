import java.util.Scanner;
public class FizzBuzz{
public static void main(String args[])
{
int rem , rev =0;
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
	String str = sc.nextLine();

	System.out.println(str.length());
         if(){
          
}
	else if(str.length()%3==0)
	{
		System.out.println("Fizz");
	}else if(str.length()%5==0)
	{
		System.out.println("Buzz");
	}else if(str.length()%7==0)
	{
	      while(str.length()>0){
			rem = str.length()%10;
			rev = (rev*10)+str.length();
			System.out.println(rev);
                       str.length() = str.length()/10;
			}

	}else if(str.length()%3==0 || str.length()%5==0)
			System.out.println("skip Output");
		
}
}
