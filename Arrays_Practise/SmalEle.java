package Arrays_Practise;

import java.util.Scanner;

public class SmalEle {
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
 
     int min = arr[0];
        for(int i=0;i<arr.length;i++){
              if(arr[i]<min){
                     min = arr[i];
              }
       }
            //   System.out.println(); 
           System.out.println("Smallest value: "+min); 
}
}
