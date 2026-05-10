package Arrays_Practise;
import java.util.Scanner;
public class CopyArray{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter size: ");
int s = sc.nextInt();
int arr[] = new int[s];
int brr[]= new int[s];

for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
}

for(int i=0;i<arr.length;i++){
	brr[i]=arr[i];
}


System.out.println("1st Array =>");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
System.out.println("Copy Array =>");
for(int i=0;i<brr.length;i++){
		System.out.println(brr[i]);
}



}
}
