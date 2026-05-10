import java.util.Scanner;
public  class CountPN{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enetr Size: ");
int s = sc.nextInt();

int arr[] = new int[s];
System.out.println("Enter Elements of Array=>");
for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
}

int p=0,n=0; 
for(int i=0;i<arr.length;i++){
	if(arr[i]>0){
		p++;
	}else{
		n++;
	}
}
System.out.println("Positive=> "+p);
System.out.println("Negative=> "+n);
}
}




