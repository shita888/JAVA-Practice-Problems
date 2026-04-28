import java.util.Scanner;
public class ArrayCMD{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
   
int arr[];
int n =  Integer.parseInt(args[0]);
arr = new int[n];

for(int i =1;i<=arr.length;i++){
    Integer.parseInt(args[i]);
} 
for(int i =1;i<=arr.length;i++){
    System .out.println(args[i]);
} 
 
}
}