package Arrays_Practise;

import java.util.Scanner;

public class SearchEle {
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

     int key = 4;
        for(int i=0;i<arr.length;i++){
              if(arr[i]==key){
                    System.out.println("Yes It Found"); 
                    break; 
              } 
       } 
    }
}
