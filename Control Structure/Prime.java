public class Prime{
public static void main(String args[]){

int n = 11,t=0; 

for(int i=2;i<n;i++)
{
 	if(n%i==0)
	{
           t=1;
	}
	else
	{
           t=0;
	}
 }


if(t==0){
System.out.println("Prime Number");
}
else{
System.out.println("NOT Prime Number");
}

}
}