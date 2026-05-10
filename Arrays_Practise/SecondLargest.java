package Arrays_Practise;
import java.util.Scanner;
public class SecondLargest{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Size: ");
int s = sc.nextInt();

int[] arr = new int[s];

for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
}

int max=arr[0];
for(int i=0;i<arr.length;i++){
	if(max < arr[i] ){
	     max=arr[i];	
	}
}
System.out.println("Largest=> "+max);

int sec;
for(int i=0;i<arr.length;i++){
	 for(int j = 0;j<arr.length;j++){
		if(arr[j]>arr[i]){
		sec = arr[j];
		arr[j]=arr[i];
		arr[i]=sec;
		}
	}
}
System.out.println("Second Largest=>  "+arr[s-2]);
System.out.println("Sorted: ");
	
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]); 	 
}
 

}
}
