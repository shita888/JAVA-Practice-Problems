public class Strong{
public static void main(String args[]){

int n = 145,rem;
int r=0;

int t = n;
while(n>0)
{
int rev=0,p=1;
	rem = n%10;
        rev = rem;
		for(int i=1;i<=rev;i++)
		{
		   p = p*i;
		}
               System.out.println("fact!"+p);
           r = p + r; 
	n = n/10;
}


System.out.println(r);
 
if(t==r){
System.out.println("Strong Number");
}
else{
System.out.println("NOT Strong Number");
}

}
}