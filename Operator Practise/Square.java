import java.util.Scanner;
public class Square{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num: ");
int a = sc.nextInt();
int c=0;
for(int i=1;i<=a;i++){
c = c+a;
}
System.out.print(c);
}
}