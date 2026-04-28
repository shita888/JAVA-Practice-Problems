public class   CountEvenandOddDigits{
public static void main(String args[]){

int a = 12345,rem,countEven=0,countOdd=0;
 
while(a>0){
int p = 0;
	rem = a%10;
        p = rem ;
        if(p%2==0){
 
		countEven++;
	}else{
	    countOdd++;
	}
	a = a/10;
 
       }

System.out.println("Total Even Digits: "+countEven);
System.out.println("Total Odd Digits: "+countOdd);
 

}
}