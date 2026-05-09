package Arrays_Practise;

import java.util.Scanner;

public class CountEO {
     public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size of array: ");
  int size = sc.nextInt();
    int sum = 0;
    int arr[]=new int[size];
    System.out.print("Enter "+size+" Elements: ");

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

    int odd=0,even=0;
        for(int i=0;i<arr.length;i++){
              if(arr[i]%2==0){
                      even++;
              }
              else{
                    odd++;
              }
       }
              System.out.println("Even: "+even); 
              System.out.println("Odd: "+odd); 
    }
}
