package Arrays_Practise;
import java.util.Scanner;
public class A1 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size of array: ");
  int size = sc.nextInt();
int sum =0,ave=0;
       int arr[]=new int[size];
 System.out.print("Enter "+size+" Elements: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
    //     System.out.print( "[");
    //    for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+",");
    //    }
    //     System.out.print("]");

    //     for(int i=0;i<arr.length;i++){
    //      sum = sum+arr[i];
    //    }
    //     System.out.println();
    //      System.out.println("Sum of elements: "+sum);

    //      for(int i=0;i<arr.length;i++){
    //      ave = sum/size;
    //    }
    //      System.out.println("Average of elements: "+ave);
        
    int max = arr[0];
        for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                     max = arr[i];
              }
       }
            //   System.out.println(); 
           System.out.println("Largest value: "+max); 


     int min = arr[0];
        for(int i=0;i<arr.length;i++){
              if(arr[i]<min){
                     min = arr[i];
              }
       }
            //   System.out.println(); 
           System.out.println("Smallest value: "+min); 

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

        int key = 4;
        for(int i=0;i<arr.length;i++){
              if(arr[i]==key){
                    System.out.println("Yes It Found"); 
                    break; 
              } 
       } 
            
        
       for(int i=arr.length-1;i>=0;i--){ 
             System.out.print( arr[i]+" "); 

       } 


    } 
}
