public class reverse1{
public static void main(String args[]){

int n = 234;
int X=0, rem;
while(n>0){

rem = n%10;
X = rem + (X*10);
System.out.println(X);
n =n/10;
}

}
}