public class NaturalOperation{
public static void main(String args[])
{
int sum=0;
int sumE=0;
int sumO=0;
for(int i = 1;i<=100;i++){
    sum = sum+i;
}
System.out.print("Sum: "+sum);

System.out.println();

for(int i = 1;i<=100;i++){
        if(i%2==0){
            sumE = sumE+i;
	}
}
System.out.print("Sum_Even: "+sumE);
System.out.println();

for(int i = 1;i<=100;i++){
        if(i%3==0){
            sumO = sumO+i;
	}
}
System.out.print("Sum_Odd: "+sumO);

  
}
}