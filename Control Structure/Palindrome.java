public class Palindrome{
public static void main(String args[]){

int n = 13523,rem,rev=0;
int t = n;
while(n>0){
	rem = n%10;
        rev = rem + (rev*10);
	n = n/10;
      }
if(t==rev){
System.out.println("Palindrome");
}
else{
System.out.println("NOT Palindrome");
}

}
}