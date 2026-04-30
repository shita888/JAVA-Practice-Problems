public class FandL{
public static void main(String args[])
{

int n = 1224,count=0,rem,reme,remo,sum;
int t = n,p=n,L,F;
while(n>0){
	rem = n%10;
        count++;
         n=n/10;
}
//System.out.println("count: "+count);
 
while(t>0){
int f =1;
 
        reme = p%10;
        int Y=reme;
        System.out.println("Last Digit: "+Y);
        L=Y;


          for(int i=1;i<count;i++){
               f = f*10;
           }
	remo = t/f;
        int X = remo;
        System.out.println("First Digit: "+X);
        F=X;

sum = F+L;
System.out.println("Sum F & L :"+sum);

System.out.println("Swap First and Last digit");
int q = L;
    L = F;
    F = q;
System.out.println("F : "+F);
System.out.println("L : "+L);

System.out.println("n : "+n);
        break;
}
 

 
}
}