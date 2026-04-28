public class Armstrong{
public static void main(String args[]){

int n = 153,rem;
int r=0;

int t = n;
while(n>0)
{
int rev=0,p=1;
	rem = n%10;
        rev = rem;
		for(int i=1;i<=3;i++)
		{
		   p = p*rev;
		}
               System.out.println("Cube"+p);
           r = p + r; 
	n = n/10;
}


System.out.println(r);
 
if(t==r){
System.out.println("Armstrong Number");
}
else{
System.out.println("NOT Armstrong Number");
}

}
}